package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void TestWithPositives() {
		int a = 10;
		int b = 20;
		int expected = 30;
		App app1 = new App();
		int actual = app1.sum(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void TestWithNegitives() {
		int a = -10;
		int b = -20;
		int expected = -30;
		App app1 = new App();
		int actual = app1.sum(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void TestWithMixed() {
		int a = -10;
		int b = 20;
		int expected = 10;
		App app1 = new App();
		int actual = app1.sum(a, b);
		assertEquals(expected, actual);
	}
}
