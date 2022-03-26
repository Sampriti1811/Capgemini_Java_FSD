package sam1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Junit2 {
	
	@After
	public void afterEveryTest() {
		System.out.println("Runs after every test case");
	}
	
	@AfterClass
	public static void afterAllTest() {
		System.out.println("Runs after all test cases");
	}
	
	@Before
	public void beforeEveryTest() {
		System.out.println("Runs before every test case");
	}
	
	@BeforeClass
	public static void beforeAllTest() {
		System.out.println("Runs before all test cases");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(true, true);
	}
	
	@Test
	public void test1() {
		assertEquals(4,Main.calculate(2, 2));
	}
	

}
