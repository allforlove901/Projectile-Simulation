import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
   Class to Display visual of projectiles motion
   @extends JComponent
   Author:	Brett Nelson
   Date:	7/7/2016
 */
public class SimulationComponent extends JComponent
{
	point p1, p2;
	
	//constructor
	//@param p1 - position of second impact
	//@param p2 - position of first impact
	public SimulationComponent(point p1, point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	//method to create visual component for trajectory
	//@param g - graphics interface
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.drawLine((int)p2.x, (int)p2.y, (int)p1.x, (int)p1.y);
	}
}
