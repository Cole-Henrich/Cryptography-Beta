package sample;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

public class ClickMap extends JPanel {

    private BufferedImage canvas;

    public ClickMap(int width, int height, ArrayList<ArrayList<Double>> clickHistory) throws IOException {
        canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        int r = (int) Math.floor(javafx.scene.paint.Color.DARKGOLDENROD.getRed() * 255);
        int g = (int) Math.floor(javafx.scene.paint.Color.DARKGOLDENROD.getGreen() * 255);
        int b = (int) Math.floor(javafx.scene.paint.Color.DARKGOLDENROD.getBlue() * 255);
        int a = (int) Math.floor(javafx.scene.paint.Color.DARKGOLDENROD.getOpacity() * 255);
        Color DARKGOLDENROD = new Color(r, g, b, a);

        for (int i = 0; i < clickHistory.size(); i++) {
            ArrayList<Double> clickCoordinatePair = clickHistory.get(i);
            double X = clickCoordinatePair.get(0);
            double Y = clickCoordinatePair.get(1);
            int x = (int) X;
            int y = (int) Y;
            canvas.setRGB(x,y, DARKGOLDENROD.getRGB());
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

    public static void main(String[] args) throws IOException {

//        JFrame frame = new JFrame("Graph");
//
//        CoordinateGrapher_FullRange panel = new CoordinateGrapher_FullRange(1440, 800, false);
//        frame.add(panel);
//
//        frame.pack();
//        frame.setVisible(true);
//        frame.setResizable(false);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

