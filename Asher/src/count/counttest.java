package count;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class counttest {
	
	static digicount obj1;
	static digicount obj2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj1 = new digicount(12345);
		obj2 = new digicount(1232);
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
		int tes=obj1.i;
		assertEquals(5,tes);
	}

	@Test
	void test2() {
		int tes=obj2.i;
		assertEquals(4,tes);
	}

}