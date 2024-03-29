package fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class fibonaccitest {
	
	static fibonacci obj1;
	static fibonacci obj2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj1 = new fibonacci(7);
		obj2 = new fibonacci(6);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		int tes=obj1.n3;
		assertEquals(8,tes);
	}
	@Test
	void test2() {
		int tes=obj2.n3;
		assertEquals(5,tes);
	}
	
}