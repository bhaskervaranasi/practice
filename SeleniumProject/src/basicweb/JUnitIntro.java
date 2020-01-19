package basicweb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitIntro {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.out.println("Exectd before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Exectd after class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before every method");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After every method");
	}

	@Test
	void test1() {
		System.out.println("Test1 method");
	}
	
	@Test
	void test2() {
		System.out.println("Test2 method");
	}

}
