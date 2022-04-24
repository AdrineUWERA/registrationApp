// indicates the package under which the class is
package interfaceScenario;

// am Main class to create instances of the classes
public class Main {
	public static void main(String[] args) {
		// creates an instance of the Sphere class and pass in radius as an argument
		Sphere sphere1 = new Sphere(5);
		
		// prints the radius of the sphere
		System.out.println("Radius: " + sphere1.radius);
		
		// gets the area of the sphere
		sphere1.getSurfaceArea();
		
		// gets the volume of the sphere
		sphere1.getVolume();
		
		System.out.println("\n ");
		
		// creates an instance of the Cylinder class and pass in radius and height as arguments
		Cylinder cylinder1 = new Cylinder(3, 10);
		
		// prints the radius of the cylinder
		System.out.println("Radius: " + cylinder1.radius);
		
		// prints the height of the cylinder
		System.out.println("Height: " + cylinder1.height);
		
		// gets the area of the cylinder
		cylinder1.getSurfaceArea();
		
		// gets the volume of the cylinder
		cylinder1.getVolume();
	}
}
