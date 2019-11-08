import javax.swing.*;
import java.awt.event.WindowEvent;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Car");
        jFrame.setSize(1500, 960);
        JMenuBar jMenuBar = new JMenuBar();
//        JButton run = new JButton("Run");
//        JButton close = new JButton("Close");
        jFrame.add(jMenuBar);
//        jMenuBar.add(run);
//        jMenuBar.add(close);

        jFrame.setJMenuBar(jMenuBar);
        JMenu file = new JMenu("File");
        jMenuBar.add(file);
        JMenuItem run = new JMenuItem("Run Simulator");
        JMenuItem close = new JMenuItem("Exit");
        file.add(run);
        file.add(close);
        jFrame.setVisible(true);
        run.addActionListener(e -> {
            JFrame jFrame2 = new JFrame();
            jFrame2.dispatchEvent(new WindowEvent(jFrame2, WindowEvent.WINDOW_CLOSING));
            Road road = new Road();
            VehicleTrafficLight vehicleTrafficLight = new VehicleTrafficLight();
            JMenuBar jMenuBar2 = new JMenuBar();
            jFrame2.setTitle("Car Simulator");
            jFrame2.setSize(1500, 960);
            jFrame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jFrame2.setContentPane(road);
            jFrame2.add(vehicleTrafficLight);
            jFrame2.setVisible(true);
            jFrame2.add(jMenuBar2);

        });
        close.addActionListener(e -> System.exit(0));


    }
}
