import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: {kishore selvam}
 * Student ID: {21011766}
 * Class: {C208}
 * Date/Time created: Friday 02-11-2021 12:13
 */

/**
 * @author 21011766
 *
 */
public class CalculatorTest {
	int a,b;
	
	Calculator cal = new Calculator();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	 a = 4321;
	 b = 1234;
	 Calculator cal = new Calculator();
		
		
			

	}

	/**
	 * @throws java.lang.Exception
	 */


	@Test
	public void testAdd() {
		int actual=cal.add(a,b);
		int expected=5555;
		assertEquals(expected,actual);
		
		
		
		
	}
	public void testSub() {
		int actual=cal.Sub(a,b);
		int expected=3087;
		assertEquals(expected,actual);

	}
	public void testMul() {
		int actual=cal.Mul(a,b);
		int expected=5332114;
		assertEquals(expected,actual);
	}
	public void testDiv() {
		int actual=cal.Div(a,b);
		int expected=3087;
		assertEquals(expected,actual);
	}
	@After
	public void tearDown() throws Exception {
	}
}

		
		