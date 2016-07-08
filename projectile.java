import java.util.Arrays;

public class projectile {

	//instance variables
	double density;
	static double ACCELERATION = 980.7;
	point currentPosition = new point();
	
	//takes in point
	public projectile(){
		//nothing here
	}
	
	public projectile(double density){
		this.density = density;
	}	
	
	//calculates path of object
	public point findPosition(double time, double timeInterval, point A, point B){
		point p = new point();
				
		double vX = (B.x - A.x)/(timeInterval/1000.0);
		double vYi = (B.y - A.y - 0.5*ACCELERATION*Math.pow(timeInterval/1000.0, 2))/(timeInterval/1000.0);
		double vZ = (B.z - A.z)/(timeInterval/1000.0);
				
		p.x = A.x + time/1000.0*vX;
		p.y = A.y + time/1000.0*vYi + 0.5*ACCELERATION*Math.pow(time/1000.0, 2);
		p.z = A.z + time/1000.0*vZ;
				
		return p;
	}
	
	public point getPosition(){
		return currentPosition;
	}
	
	public void printPosition(point p){
		System.out.println("x: " + p.x + "  y: " + p.y + "  z: " + p.z);
	}
}
