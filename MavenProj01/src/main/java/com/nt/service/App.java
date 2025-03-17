package com.nt.service;

/**
 * Hello world!
 */
public class App {
	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		App app = new App();
		System.out.println("Sum= " + app.sum(24, 24));
	}
}
