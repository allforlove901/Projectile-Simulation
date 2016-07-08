import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Color;

/**
   Class to test simulation of projectile motion
   Author:	Brett Nelson
   Date:	7/7/2016
 */
public class testProjectile {

	//Main method
	public static void main(String[] args) {
		
		//creates new JFrame window
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setTitle("Projectile Simulation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
		//create points for start and finish as well as a temp store point p4
		point p1 = new point(100,400,0);
		point p2 = new point(600,140,35);
		point p4 = p1;
		projectile pro = new projectile();
		double timeInterval = 1400;
		double startTime = System.currentTimeMillis();
		
		//delay animation for half a sec
		while(System.currentTimeMillis()-startTime < 500){}
		
		//Run simulation
		while(System.currentTimeMillis()-startTime < timeInterval + 500){
			if(System.currentTimeMillis()%1 == 0){
				point p3 = pro.findPosition(System.currentTimeMillis()-(startTime+500), timeInterval, p1, p2);
				SimulationComponent comp = new SimulationComponent(p3, p4);
				frame.add(comp);
				frame.setVisible(true);	
				p4 = p3;//set p4 to previously found point
			}//close if
		}//close while
	}//close main
}
