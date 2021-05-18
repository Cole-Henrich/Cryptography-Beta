package sample;

import javafx.scene.control.CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PascalMain {
    private static JPanel panel;
    private static JFrame frame;
    private static Label label;
    private static JSlider slider;
    private static ArrayList<PascalGUI> pascalGUIs;
    public static void main(String[] args) throws FileNotFoundException {
        pascalGUIs = new ArrayList<>();
        frame = new JFrame("Pascal's Triangle");
        panel = new JPanel();
        int initialSliderValue = 10;
        slider = new JSlider(1, 1, 20, initialSliderValue);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        label = new Label("Number of rows in the triangle -> " + initialSliderValue);
        update();
        slider.addChangeListener(e -> {
            changeLabel();
            updatePascalGUIS();
            update();
        });

//        Checkbox AWTCheckBox = new Checkbox("Display the triangle as center-aligned?", false);
//        frame.add(AWTCheckBox);
    }
    private static void changeLabel(){
        label.setText("Number of rows in the triangle -> " + slider.getValue());
    }
    private static void updatePascalGUIS(){
        if (pascalGUIs.size() > 0){
            for (int i = 0; i < pascalGUIs.size(); i++) {
                pascalGUIs.remove(i);
            }
        }
        for (boolean Boolean: new boolean[]{true /*,false*/}) {
            pascalGUIs.add(new PascalGUI(new PascalsTriangle(slider.getValue()), Boolean));
        }
        for (PascalGUI pascalGUI: pascalGUIs) {
            panel.add(pascalGUI);
        }
    }
    private static void update(){
        panel.add(label);
        panel.add(slider);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setMinimumSize(new Dimension(1440, 800));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}