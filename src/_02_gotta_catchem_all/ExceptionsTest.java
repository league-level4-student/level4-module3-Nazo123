package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();
	
	//1. This is an example of how one might test that an exception is thrown.
	//   It tests that an IndexOutOfBoundsException is thrown 
	@Test
	public void testIndexOOBException() {
		int[] vars = {0, 1, 2, 3};
			
		try {
			vars[0] = 4;
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
			vars[4] = 5;
			fail("IndexOutOfBoundsException not thrown");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
		}
	}
	
	//2. In the ExceptionMethods class, write a method called divide that takes
	//   two doubles as parameters and returns their quotient as a double. This method 
	//   should throw an IllegalArgumentException if the denominator is 0.0.
	
	//3. Complete the JUnit test method to test the divide method.
	@Test
	public void testDivideByZeroException() {
	
		
		double den = 0.0;
		double div = 1.0;
	
				try {
					em.divideZero(div, den);
		
					fail("IllegalArgumentException not thrown");
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				}
				try {
					den = 2.0;
					assertEquals(em.divideZero(div, den),0.5);
	
				} catch (IllegalArgumentException e) {
					fail("IllegalArgumentException not thrown");
					e.printStackTrace();
				}
			

	//4. In the ExceptionMethods class, write a method called reverseString that takes a
	//   String and returns the reverse of that String. It should throw an IllegalStateException
	//   if the String passed in is empty
	
	//5. Complete the JUnit test method to test the reverseStringMethod.
	}
	@Test
	public void testReverseString() {
		String s = "";
	try {
			em.reverseString(s);
			fail("IllegalStateException not thrown");
	} catch(IllegalStateException e) {
		e.printStackTrace();
	}
	s = "Hello";
	try {
		assertEquals(em.reverseString(s), "olleH");
		
} catch(IllegalStateException e) {
	fail("IllegalStateException not thrown");
	e.printStackTrace();
}
		
	}
	
	
	

}
