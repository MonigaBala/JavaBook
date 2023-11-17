package com.javabook.basics;

public class MixedMessageChapterOne {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			y = y + 2; // Filling these empty blocks to
			if (y > 4) { // get given
				y = y - 1; // output
			}
			System.out.println(x + " " + y);
			x = x + 1;
		}
	}

}
