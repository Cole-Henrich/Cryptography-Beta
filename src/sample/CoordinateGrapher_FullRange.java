package sample;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

/**
 * Whereas the limited coordinate grapher graphs every point until it runs into the bounds
 * (therefore graphing the first 500 or so, but missing the tens of thousands of others),
 * this scales the graph, so that it can display both the first and the last points.
 * It skips points in ratio to how many it needs to fit.
 */
@SuppressWarnings("MagicNumber")
public class CoordinateGrapher_FullRange extends JPanel {

    private BufferedImage canvas;
    int MAX_X;
    int MAX_Y;
    int new_x_every_;
    int new_y_every_;

    int numPointsGraphed;


    ArrayList<ArrayList<Integer>> coordinates;
    ArrayList<ArrayList<Integer>> graphCoordinates;
    public CoordinateGrapher_FullRange(int width, int height, boolean fullX) throws IOException {
        graphCoordinates = new ArrayList<>();
        Unique_Words_Accumulator accumulator = new Unique_Words_Accumulator();
        coordinates = accumulator.getCoordinates();
        numPointsGraphed = 0;
        MAX_X = coordinates.get(coordinates.size()-1).get(0);
        MAX_Y = coordinates.get(coordinates.size()-1).get(1);
        new_x_every_ = (int) Math.ceil((double)MAX_X/(double)width);
        new_y_every_ = (int) Math.ceil((double)MAX_Y/(double)height);
        int new_n_every_=new_x_every_;
        if (!fullX){
            new_n_every_ = new_y_every_;
        }

        canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        fillCanvas(Color.cyan);
        File yFile = new File("sample/yPoints.txt");
        File xFile = new File("sample/xPoints.txt");
        FileWriter yWriter = new FileWriter(yFile);
        FileWriter xWriter = new FileWriter(xFile);
        for (int i = 0; i < coordinates.size(); i++) {
            ArrayList<Integer> xy = coordinates.get(i);
            xWriter.write(String.valueOf(xy.get(0))+"\n");
            yWriter.write(String.valueOf(xy.get(1))+"\n");
            if (i % new_n_every_ == 0) {
                    int x = (int) ((double) xy.get(0) / (double) new_n_every_);
                    int y = ((int) ((double) xy.get(1)/(double)new_n_every_));
                    numPointsGraphed++;
                    System.out.println(" COORDINATE --->   x: "+ x + " y: "+ y);
                    System.out.println("numPointsGraphed:  "+ numPointsGraphed);
                    graphCoordinates.add(new ArrayList<Integer>(Arrays.asList(x, y)));
                }
            }
        xWriter.close();
        yWriter.close();
        System.out.println(graphCoordinates);
        for (ArrayList<Integer> xy : graphCoordinates) {
            if (!fullX) {
                if (xy.get(0) > width - 10) {
                    break;
                }
            }
            canvas.setRGB(xy.get(0), (height-xy.get(1))-1, Color.magenta.getRGB());
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(canvas.getWidth(), canvas.getHeight());
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(canvas, null, null);
    }


    public void fillCanvas(Color c) {
        int color = c.getRGB();
        for (int x = 0; x < canvas.getWidth(); x++) {
            for (int y = 0; y < canvas.getHeight(); y++) {
                canvas.setRGB(x, y, color);
            }
        }
        repaint();
    }


    public void drawLine(Color c, int x1, int y1, int x2, int y2) {
        // Implement line drawing
        repaint();
    }

    public void drawRect(Color c, int x1, int y1, int width, int height) {
        int color = c.getRGB();
        // Implement rectangle drawing
        for (int x = x1; x < x1 + width; x++) {
            for (int y = y1; y < y1 + height; y++) {
                canvas.setRGB(x, y, color);
            }
        }
        repaint();
    }

    public void drawOval(Color c, int x1, int y1, int width, int height) {
        // Implement oval drawing
        repaint();
    }
    public int getNumPointsGraphed(){return numPointsGraphed;}

    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame("Graph");

        CoordinateGrapher_FullRange panel = new CoordinateGrapher_FullRange(1440, 800, false);
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

