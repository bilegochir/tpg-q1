package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question1 {

	private static Scanner scan;

	public static void main(String[] args) {
		try {
			scan = new Scanner(System.in);

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

				System.out.print("Reshuffled string: ");
				for (Object cl : charList)
					System.out.print((Character) cl);

			} else {
				System.out.println("Please insert only 1 or 2");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
