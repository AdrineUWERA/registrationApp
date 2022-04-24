// indicates the package under which the interface is
package interfaceScenario;

// an interface for solid shapes
public interface SolidShape {
	//It has no constructor, and it cannot be used to create objects
	
	// a method to get the surface area of the solid shape
	// by default the methods are public and abstract
	void getSurfaceArea();
	
	// a method to get the volume of the solid shape
	// by default the methods are public and abstract
    void getVolume();
}
