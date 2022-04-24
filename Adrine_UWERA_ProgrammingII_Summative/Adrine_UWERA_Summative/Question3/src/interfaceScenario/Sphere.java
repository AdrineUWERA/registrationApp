// indicates the package under which the class is
package interfaceScenario;

// Sphere class that implements the SolidShape interface
public class Sphere implements SolidShape{
	
	// declares attributes of the Sphere class
	// Used default access modifier because I want to access these properties within the package, for instance,
	// int the Main class
	double radius;
	double volume;
	double area;
	
	// constructor class for the Spehere class. Will allow pass in arguments when creating an object of 
	// the Sphere class
	public Sphere(double r) {
		// set the attribute to the passed in parameter
		this.radius = r;
	}
	
	// implement the getSurfaceArea() method of the SolidShape interface
	public void getSurfaceArea() {
		// adding a body of the method
		// calculates the surface area using the respective formula of getting the surface area of a Sphere
		area = 4 * Math.pow(this.radius,2) * Math.PI;
		// prints the result for the surface area
		System.out.println("The surface area of the sphere is: " + area + " unit area");
	}
	
	// implement the getVolume() method of the SolidShape interface
	public void getVolume() {
		// adding a body of the method
		// calculates the volume using the respective formula of getting the volume of a Sphere
		volume = (4/3) * Math.pow(this.radius, 3) * Math.PI;
		
		// prints the result for the volume
		System.out.println("The volume of the sphere is: " + volume + " unit volume");
	}
	
}
