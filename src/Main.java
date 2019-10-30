import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        Road road = new Road();
        TrafficLights trafficLights = new TrafficLights();
        Vehicle vehicle = new Vehicle();
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Car Simulator");
        jFrame.setSize(1500, 960);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(road);
        jFrame.add(trafficLights);
    }
}
