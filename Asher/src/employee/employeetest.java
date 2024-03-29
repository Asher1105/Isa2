package employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class employeetest {
	static employee obj;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj = new employee("John","DA");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		obj.calculate(50000);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		float tes=obj.DA;
		assertEquals(10,tes);
	}

}