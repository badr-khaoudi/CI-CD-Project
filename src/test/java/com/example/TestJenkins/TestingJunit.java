package com.example.TestJenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingJunit {

	@Test
	void test() {
		JunitTesting test= new JunitTesting();
		int output = test.Test(5);
		assertEquals(25, output);
		System.out.println("Junit Test Done");
	}

}
