package com.javabook.basics;

import java.util.Scanner;

public class ConditionalIfElse {

	public static void main(String[] args) {
		
		// To check the given number is ODD or Even
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer to check odd or even:");
		int num = scanner.nextInt();
		
		if (num > 0 && num % 2 == 0) {
			System.out.println("The given number is EVEN");
		} else if (num > 0 && num % 2 != 0) {
			System.out.println("The given number is ODD");
		} else {
			System.out.println("Given input cannot be decided into ODD or EVEN");
		}
		
		scanner.close();
	}

}
