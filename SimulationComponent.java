import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
   Displays a bull's eye.
 */
public class SimulationComponent extends JComponent
{
	point p1, p2;
	public SimulationComponent(point p1, point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      //Ellipse2D.Double marker = new Ellipse2D.Double(currentPosition.x, currentPosition.y, 5, 5);
      g2.setColor(Color.BLACK);
      //g2.fill(marker);
      g2.drawLine((int)p2.x, (int)p2.y, (int)p1.x, (int)p1.y);
   }
}