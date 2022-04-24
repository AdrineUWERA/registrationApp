// indicates the package in which the testing class is
package simpleCalculator;

// imports dependencies for the JUnit test
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// a class to test the Calculator class
public class TestingCalculatorOperations {
	// overrides the test method
	@Test
	public void test() throws InterruptedException {
		// creates an object of the Calculator class
		Calculator calculator = new Calculator();
		
		// adds the two numbers using the add method of the Calculator class
		double x = calculator.add(6, 4);
		// checks if the result matches the expected result
		assertEquals(x, 10);
		
		// subtract the second number from the first number using the subtract method of the Calculator class
		double y = calculator.subtract(6, 4);
		// checks if the result matches the expected result
		assertEquals(y, 2);
		
		// multiplies the two numbers using the multiply method of the Calculator class
		double z = calculator.multiply(6, 4);
		// checks if the result matches the expected result
		assertEquals(z, 24);
		
		// divides the first number by the second number using the divide method of the Calculator class
		double w = calculator.divide(12, 4);
		// checks if the result matches the expected result
		assertEquals(w, 3);
	}
}
