package com.javabook.basics;

import java.util.Scanner;

public class LeapYearUsingIfElse {

	public static void main(String[] args) {
		
		//Using STD input to get a year to check for leap year or not
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a year to check for leap year: ");
		int year = scanner.nextInt();
		
		//Ternary operator is used in case of if else i.e,condition?true statements:false statements
		String result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "This is a leap year"
				: "This is not a leap year";
		
		System.out.println(result);
		scanner.close();

	}

}
