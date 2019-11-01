import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TrafficLights extends JPanel {
    int change;
    Random random = new Random();

    TrafficLights() {
        setOpaque(false);
        setPreferredSize(new Dimension(1500, 960));
        setBackground(new Color(255, 255, 255, 0));
        t.start();
    }

    Timer t = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            change = random.nextInt(2);
            repaint();
        }

    });

    public void paintComponent(Graphics tl) {
        super.paintComponent(tl);
        if (change == 0) {
            tl.setColor(Color.RED);
            tl.fillRect(580, 199, 20, 40);
        }
        if (change == 1) {
            tl.setColor(Color.green);
            tl.fillRect(580, 199, 20, 40);
        }


    }


}


//        tl.setColor(Color.green);
//        tl.fillRect(580, 199, 20, 40);
//
//        tl.setColor(Color.red);
//        tl.fillRect(580, 199, 20, 40);
//


//    public void timea() {
//        try {
//            Thread.sleep(5000);
//        } catch (Exception e) {
//
//        }
//    }
//    final int Red = 0;
//    final int Green = 1;
//    int Change;
//    private Timer timer;
//
//    public void animate() {
//        if (timer != null) {
//            timer.stop();
//        }
//        timer = new Timer(1000 / 60, e -> {
//            if (timer == null) return;
//
//
//            repaint();
//        });
//        timer.start();
//    }
//
//    public void paint(Graphics tl) {
//        tl.setColor(Color.green);
//        tl.fillRect(580, 199, 20, 40);
//
//    }
//
//}