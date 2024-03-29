package dog;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class dogtest {
	
	static dog t;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		t = new dog("Atom","German Shepard");
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
		String t1=t.name;
		String t2=t.breed;
		assertEquals("Atom",t1);
		assertEquals("German Shepard",t2);
	}

}