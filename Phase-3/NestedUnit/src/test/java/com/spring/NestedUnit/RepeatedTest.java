package com.spring.NestedUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RepeatedTest {
	
	Calculator cal=null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		 System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		cal= new Calculator();
		 System.out.println("SetUp Before Each Test");
	}

	@AfterEach
	void tearDown() throws Exception {
		cal=null;
		 System.out.println("After each test");
	}

	@Test
	@DisplayName("Add Operation Test")
	@org.junit.jupiter.api.RepeatedTest(value=6)
	void addmethod() {
		assertEquals(6,cal.add(4, 2),"4+2 equals to 6");
		System.out.println("=====Test Passed=====");
	}

}
