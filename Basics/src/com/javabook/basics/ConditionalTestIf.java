package com.javabook.basics;
/**
 *  Basic Program to print the number using "if condition"
 *  @author Moniga 
 */

import java.util.Scanner;

public class ConditionalTestIf {

	public static void main(String[] args) {
		int a = 5;
		if (a > 0) {
			System.out.println("The number is : " + a);
		}
		
		//Using Scanner input checking the if condition
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check it is valid : ");
		int num = scanner.nextInt();
		
		if (num == 0) {
			System.out.println("The number is invalid..");
		} else {
			System.out.println("The entered number is : " + num);
		}
		scanner.close();
	}

}
