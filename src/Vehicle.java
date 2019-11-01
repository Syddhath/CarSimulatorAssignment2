import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;



public class Vehicle extends JPanel implements ActionListener {
    Timer tm = new Timer(5, this);
    int x = 0, velX = 2;

    int change;
    Random random = new Random();
    Timer t = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            change = random.nextInt(2);
            repaint();
        }

    });

    Vehicle() {
        setOpaque(false);
        setPreferredSize(new Dimension(1500, 960));
        setBackground(new Color(255, 255, 255, 0));
        tm.start();
        t.start();
    }

    @Override
    protected void paintComponent(Graphics c) {
        super.paintComponent(c);
        c.setColor(Color.green);
        c.fillRect(x, 290, 40, 20);

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
        x = x + velX;


            if (x > 500 && x < 600 && change == 0) {
                tm.stop();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                change++;
                tm.start();
            }

        repaint();
    }
}
