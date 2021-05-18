package sample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CoordinateGrapher_WithLimits extends JPanel {

    private BufferedImage canvas;
    
    ArrayList<ArrayList<Integer>> coordinates;
    public CoordinateGrapher_WithLimits(int width, int height) throws FileNotFoundException {
        Unique_Words_Accumulator accumulator = new Unique_Words_Accumulator();
        coordinates = accumulator.getCoordinates();

        canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        fillCanvas(Color.BLUE);
        for (ArrayList<Integer> xy : coordinates) {
            int x = xy.get(0);
            int y = height-xy.get(1);
            if (x < width && y < height && y > 0) {
                drawRect(Color.RED,x, y, 1, 1);
            }
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

    public static void main(String[] args) throws FileNotFoundException {

        JFrame frame = new JFrame("Graph, Unscaled, Limited Data View");

        CoordinateGrapher_WithLimits panel = new CoordinateGrapher_WithLimits(1440, 900);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
