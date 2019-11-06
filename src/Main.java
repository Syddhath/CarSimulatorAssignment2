import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setTitle("Car");
        jFrame.setSize(1500, 960);
        JMenuBar jMenuBar = new JMenuBar();
        JButton run = new JButton("Run");
        JButton close = new JButton("Close");
        jFrame.add(jMenuBar);
        jMenuBar.add(run);
        jMenuBar.add(close);
        jFrame.setVisible(true);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame2 = new JFrame();
                jFrame2.dispatchEvent(new WindowEvent(jFrame2, WindowEvent.WINDOW_CLOSING));
                Road road = new Road();
                Vehicle vehicle = new Vehicle();
                JMenuBar jMenuBar2 = new JMenuBar();
                jFrame2.setTitle("Car Simulator");
                jFrame2.setSize(1500, 960);
                jFrame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
                jFrame2.setContentPane(road);
                jFrame2.add(vehicle);
                jFrame2.setVisible(true);
                jFrame2.add(jMenuBar2);

                JButton rerun = new JButton("ReRun");
                jMenuBar2.add(rerun);

                rerun.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });



            }
        });
    }
}