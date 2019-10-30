import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Road extends JPanel {


    public void paint(Graphics rl) {


        rl.drawLine(0, 240, (int) 600, 240);
        rl.drawLine((int) 850.25, 240, 1450, 240);


    }

    public static void main(String[] args) {
        Road t = new Road();
        JFrame jFrame = new JFrame();
        jFrame.add(t);
        jFrame.setTitle("Tut");
        jFrame.setSize(1500, 960);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }}