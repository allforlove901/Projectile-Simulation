/**
 * Class to implement 3d point object
 * Author:	Brett Nelson
 * Date:	7/7/2016
**/
public class point {
	
	//instance variables to represent standard cartesian coordinates
	double x = 0, y = 0, z = 0;
	
	//no-args constructor
	public point(){
		//nothing here
	}
	
	//Constructor
	//@param x - double type representing x component
	//@param y - double type representing y component
	//@param z - double type representing z component
	public point(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
