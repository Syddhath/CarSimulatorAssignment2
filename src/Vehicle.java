import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Vehicle extends JPanel implements ActionListener {
    Timer tm = new Timer(5, this);
    int x = 0, velX = 2;

    Vehicle() {
        setOpaque(false);
        setPreferredSize(new Dimension(1500, 960));
        setBackground(new Color(255, 255, 255, 0));
        tm.start();
    }

    @Override
    protected void paintComponent(Graphics c) {
        super.paintComponent(c);
        c.setColor(Color.green);
        c.fillRect(x, 290, 40, 20);
    }

//    public void paint(Graphics c) {
//        c.setColor(getBackground());
//        Rectangle r = c.getClipBounds();
//        c.setColor(Color.green);
//        c.fillRect(x, 290, 40, 20);
//        tm.start();
//        super.paint(c);
//    }


    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + velX;
        repaint();
    }
}
