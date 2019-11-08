import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class VehicleTrafficLight extends JPanel implements ActionListener {

    //Timer for the car moving left to right

    private Timer rCar = new Timer(5, this);
    private int x = 0;
    private int y = 1450;
    private int change;
    private Random random = new Random();

    VehicleTrafficLight() {

        //Code for not overlapping the VehicleTrafficLight class to Road class frame.

        setOpaque(false);
        setPreferredSize(new Dimension(1500, 960));
        setBackground(new Color(255, 255, 255, 0));

        //Starting the car

        rCar.start();

        //Traffic light timer

        Timer t = new Timer(1000, e -> {
            change = random.nextInt(2);
            repaint();
        });
        t.start();

        //Car moving from right to left

        Timer verCar = new Timer(5, e -> {
            int velY = 2;
            y = y - velY;
            repaint();
        });
        verCar.start();

        //Button for Restart the program

        JButton rerun = new JButton("ReRun");
        add(rerun);
        rerun.addActionListener(e -> {
            JFrame jFrame2 = new JFrame();
            Road road = new Road();
            VehicleTrafficLight vehicleTrafficLight = new VehicleTrafficLight();
            jFrame2.setTitle("Car Simulator");
            jFrame2.setSize(1500, 960);
            jFrame2.setContentPane(road);
            jFrame2.add(vehicleTrafficLight);
            jFrame2.setVisible(true);
        });

        //Button to exit the Simulator

        JButton exit = new JButton("Exit");
        add(exit);
        exit.addActionListener(e -> System.exit(0));
    }

    //Drawing the car and the starting position

    @Override
    protected void paintComponent(Graphics c) {
        super.paintComponent(c);
        c.setColor(Color.blue);
        c.fillRect(x, 290, 40, 20);

        c.setColor(Color.GRAY);
        c.fillRect(y, 390, 40, 20);

        //Traffic light working

        if (change == 0) {
            c.setColor(Color.RED);
            c.fillRect(600, 190, 20, 40);
        }
        if (change == 1) {
            c.setColor(Color.GREEN);
            c.fillRect(600, 190, 20, 40);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Car moving working from left to right

        int velX = 2;
        x = x + velX;

        //Car stopping at red light and moving at green light

        if (x > 500 && x < 600 && change == 0) {
            rCar.stop();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            change++;
            rCar.start();
        }
        repaint();
    }
}