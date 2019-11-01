import javax.swing.*;
import java.awt.*;

public class Road extends JPanel {


    @Override
    protected void paintComponent(Graphics rl) {
        super.paintComponent(rl);
        rl.setColor(Color.BLUE);
        rl.drawLine(0, 240, 600, 240);
        rl.drawLine((int) 850.25, 240, 1450, 240);
        rl.drawLine(0, 480, 600, 480);
        rl.drawLine((int) 850.25, 480, 1450, 480);


        rl.drawLine(0, 360, 120, 360);
        rl.drawLine(240, 360, 360, 360);
        rl.drawLine(480, 360, 600, 360);

        rl.drawLine((int) 850.25, 360, (int) 970.25, 360);
        rl.drawLine((int) 1090.25, 360, (int) 1210.25, 360);
        rl.drawLine((int) 1330.25, 360, (int) 1450.25, 360);
    }

//    public void paint(Graphics rl) {
//
//        rl.drawLine(0, 240, 600, 240);
//        rl.drawLine((int) 850.25, 240, 1450, 240);
//        rl.drawLine(0, 480, 600, 480);
//        rl.drawLine((int) 850.25, 480, 1450, 480);
//
//
//        rl.drawLine(0, 360, 120, 360);
//        rl.drawLine(240, 360, 360, 360);
//        rl.drawLine(480, 360, 600, 360);
//
//        rl.drawLine((int) 850.25, 360, (int) 970.25, 360);
//        rl.drawLine((int) 1090.25, 360, (int) 1210.25, 360);
//        rl.drawLine((int) 1330.25, 360, (int) 1450.25, 360);
//
//
//
//
//
//    }


}