package sam1;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit1 {

	@AfterEach
	void afterEveryTest() {
		System.out.println("Runs after every test case");
	}
	
	@AfterAll
	static void afterAllTest() {
		System.out.println("Runs after all tests");
	}
	
	@BeforeEach
	void beforeEveryTest() {
		System.out.println("Runs before every test case");
	}
	
	@BeforeAll
	static void beforeAllTest() {
		System.out.println("Runs before all tests");
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
