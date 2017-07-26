package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please insert your string");
		String str = scan.nextLine();

		System.out.println("1. Reverse\n2. Reshuffle");
		int opt = scan.nextInt();

		if (opt == 1) {
			System.out.println("Reversed string: " + new StringBuilder(str).reverse());
		} else if (opt == 2) {
			
			char[] ch = str.toCharArray();
			List<Character> charList = new ArrayList<Character>();
			
			for (char c : ch) {
				charList.add(c);
			}
			
			Collections.shuffle(charList);

			for (Object cl : charList)
				System.out.print((Character) cl);

		}
	}
}
