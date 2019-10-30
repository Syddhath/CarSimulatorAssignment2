import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        Road t = new Road();
        JFrame jFrame = new JFrame();
        jFrame.add(t);
        jFrame.setTitle("Car Simulator");
        jFrame.setSize(1500, 960);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
}}
