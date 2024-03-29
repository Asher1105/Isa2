package person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class persontest {
	
	static person obj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj = new person(34,"Alister");
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
	void test() {
		int t1=obj.age;
		String t2=obj.name;
		assertEquals(34,t1);
		assertEquals("Alister",t2);
	}

}