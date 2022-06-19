// Create a Canvas Having smiley face.

import java.awt.*;
import javax.swing.*;

class Xyz extends JFrame{

    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(520,200,240,240);
        g.setColor(Color.black);
        g.fillOval(670,260,40,40);
        g.fillOval(670,260,40,40);
        g.setColor(Color.red);
        g.fillArc(585,285,110,60,250,45);
        g.setColor(Color.black);
        g.fillArc(590,340,110,60,180,101);
    }

    public static void main(String[] args)
    {
        Xyz d = new Xyz();
        JFrame obj = new JFrame();
        d.setSize(300,400);
        d.setVisible(true);
    }
}