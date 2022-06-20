// Create a Canvas Having smiley face.

import javax.swing.*;
import java.awt.*;

class smiley extends JFrame
{
  public void paint(Graphics g)
  {
      g.setColor(Color.YELLOW);
      g.fillOval(520,200,240,240);
      g.setColor(Color.BLACK);
      g.fillOval(570,260,40,40);
      g.fillOval(670,260,40,40);
      g.setColor(Color.RED);
      g.fillArc(585,285,110,60,250,45);
      g.setColor(Color.BLACK);
      g.fillArc(590,340,110,60,180,181); 
  }

 public static void main(String[] args)
 {
    smiley d = new smiley();
    JFrame obj = new JFrame();
    d.setSize(300,400);
    d.setVisible(true);
 }
}
