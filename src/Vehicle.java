import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Vehicle extends JPanel implements ActionListener {
    Timer tm = new Timer(5, this);
    int x = 0, velX = 2;

    public void paint(Graphics c) {
        c.setColor(Color.green);
        c.fillRect(x, 290, 40, 20);
        tm.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + velX;
        repaint();
    }
}
