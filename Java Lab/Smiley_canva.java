
import java.awt.*;
import javax.swing.*;

class Xyz extends Canvas
{ 
	
	public void paint(Graphics g)
	{
		g.drawOval(140,120,200,200); 
		g.setColor(Color.yellow);
		g.fillOval(140,120,200,200);
		g.setColor(Color.black);

		g.drawOval(180,170,40,40);
		g.setColor(Color.white);
		g.fillOval(180,170,40,40);
		g.setColor(Color.black);

		g.drawOval(260,170,40,40);
		g.setColor(Color.white);
		g.fillOval(260,170,40,40);
		g.setColor(Color.black);

		g.drawLine(240,210,240,230);
		g.drawArc(220,230,40,40,0,-180);

	} 
	public static void main(String args[])
	{
		Xyz d = new Xyz();
		JFrame f = new JFrame();   
        		f.setSize(500,400);  
        		f.setVisible(true);  
        		f.add(d); 
	}
}
