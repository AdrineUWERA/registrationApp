// indicates the package under which the class is
package interfaceScenario;

// Cylinder class that implements the SolidShape interface
public class Cylinder implements SolidShape{
	// declares attributes of the Cylinder class
	// Used default access modifier because I want to access these properties within the package, for instance,
	// int the Main class
	double radius;
	double height;
	double volume;
	double area;
	
	// constructor class for the Cylinder class. Will allow pass in arguments when creating an object of 
	// the Cylinder class
	public Cylinder(double r, double h) {
		// set the attributes to the passed in parameters respectively
		this.radius = r;
		this.height = h;
	}
	
	// implement the getSurfaceArea() method of the SolidShape interface
	public void getSurfaceArea() {
		// adding a body of the method
		// calculates the surface area using the respective formula of getting the surface area of a Cylinder
		area = 2 * Math.PI * this.radius * (this.radius + this.height) ;
		
		// prints the result for the surface area
		System.out.println("The surface area of the cylinder is: " + area + " unit area");
	}
	
	// implement the getVolume() method of the SolidShape interface
	public void getVolume() {
		// adding a body of the method
		// calculates the volume sing the respective formula of getting the volume of a Cylinder
		volume = Math.PI * Math.pow(this.radius,2) * this.height ;
		
		// prints the result for the volume
		System.out.println("The volume of the cylinder is: " + volume + " unit volume");
	}
	
}