/**
   Class to implement projectile object
   Author:	Brett Nelson
   Date:	7/7/2016
 */
public class projectile {

	//Instance variables
	double density;
	static double ACCELERATION = 980.7; //ACCELERATION not = 9.87 due to visualization problems
	point currentPosition = new point();
	
	//no-args Constructor
	public projectile(){
		//nothing here
	}
	
	//Constructor to account for density of projectile
	//@param density - double type representing density of projectile
	public projectile(double density){
		this.density = density;
	}	
	
	//Method to find current position of a projectile in space
	//@param time - double type representing current amount of time passed
	//@param timeInterval - double type representing total time taken for projectile to travel 
	//@param A - point type representing current start point
	//@param B - point type representing current end point
	public point findPosition(double time, double timeInterval, point A, point B){
		point p = new point();
		
		//Finding initial velocity components
		double vX = (B.x - A.x)/(timeInterval/1000.0);
		double vYi = (B.y - A.y - 0.5*ACCELERATION*Math.pow(timeInterval/1000.0, 2))/(timeInterval/1000.0);
		double vZ = (B.z - A.z)/(timeInterval/1000.0);
		
		//Finding new component positions
		p.x = A.x + time/1000.0*vX;
		p.y = A.y + time/1000.0*vYi + 0.5*ACCELERATION*Math.pow(time/1000.0, 2);
		p.z = A.z + time/1000.0*vZ;
				
		return p;
	}
	
	/**
	public point getPosition(){
		return currentPosition;
	}**/
	
	/**
	public void printPosition(point p){
		System.out.println("x: " + p.x + "  y: " + p.y + "  z: " + p.z);
	}**/
}
