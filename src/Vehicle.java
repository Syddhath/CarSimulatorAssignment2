import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Vehicle extends JPanel implements ActionListener {
    private Timer horiCar = new Timer(5, this);
    private int x = 0;
    private int y = 1450;
    private int change;
    private Random random = new Random();

    Vehicle() {
        setOpaque(false);
        setPreferredSize(new Dimension(1500, 960));
        setBackground(new Color(255, 255, 255, 0));
        horiCar.start();
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                change = random.nextInt(2);
                repaint();
            }
        });
        t.start();
        Timer verCar = new Timer(5, e -> {
            int velY = 2;
            y = y - velY;
            repaint();
        });
        verCar.start();

        JButton rerun = new JButton("ReRun");
        add(rerun);
        rerun.addActionListener(e -> {
            JFrame jFrame2 = new JFrame();
            Road road = new Road();
            Vehicle vehicle = new Vehicle();
            jFrame2.setTitle("Car Simulator");
            jFrame2.setSize(1500, 960);
            jFrame2.setContentPane(road);
            jFrame2.add(vehicle);
            jFrame2.setVisible(true);
        });
    }

    @Override
    protected void paintComponent(Graphics c) {
        super.paintComponent(c);
        c.setColor(Color.blue);
        c.fillRect(x, 290, 40, 20);

//        c.setColor(Color.PINK);
//        c.fillRect(x, 390, 40, 20);

        c.setColor(Color.GRAY);
        c.fillRect(y, 390, 40, 20);

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
        int velX = 2;
        x = x + velX;
        if (x > 500 && x < 600 && change == 0) {
            horiCar.stop();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            change++;
            horiCar.start();
        }
        repaint();
    }
}