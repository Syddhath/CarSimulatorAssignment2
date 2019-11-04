import javax.swing.*;
import java.awt.*;

public class Road extends JPanel {


    @Override
    protected void paintComponent(Graphics rl) {
        super.paintComponent(rl);


        //horizontal

        rl.drawLine(0, 240, 600, 240);
        rl.drawLine((int) 850.25, 240, 1450, 240);
        rl.drawLine(0, 480, 600, 480);
        rl.drawLine((int) 850.25, 480, 1450, 480);

        //Vertical
        rl.drawLine(600, 240, 600, 0);
        rl.drawLine((int) 850.25, 240, (int) 850.25, 0);
        rl.drawLine(600, 480, 600, 1200);
        rl.drawLine((int) 850.25, 480, (int) 850.25, 1200);


        //Road Line horizontal
        rl.drawLine(0, 360, 120, 360);
        rl.drawLine(240, 360, 360, 360);
        rl.drawLine(480, 360, 600, 360);


        //ROAD line vertical
        rl.drawLine(720, 60, 720, 180);
        rl.drawLine(720, 480, 720, 600);
        rl.drawLine(720, 720, 720, 840);

        //Road Line horizontal
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