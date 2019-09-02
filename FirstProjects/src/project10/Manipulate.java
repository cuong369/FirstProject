package project10;

import java.util.Scanner;

public class Manipulate {

	public static void showMenu() {
		System.out.println("1. Input a String");
		System.out.println("2. Reverse the String");
		System.out.println("3. Uppercase all letters");
		System.out.println("4. Lowercase all letters");
		System.out.println("5. Count words");
		System.out.println("6. Count letters");
		System.out.println("7. Exit");
	}

	public static void main(String[] args) {
		String inputString = "";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			showMenu();
			System.out.println("Please Enter Choose: ");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				System.out.print("Input a String: ");
				inputString = sc.nextLine();
				break;
			case 2:
				System.out.println("Reverse the String: ");
				System.out.println(Functions.reverseString(inputString));
				break;
			case 3:
				System.out.println("Uppercase all letters");
				System.out.println(Functions.uppercaseAllLetters(inputString));
				break;
			case 4:
				System.out.println("Lowercase all letters");
				System.out.println(Functions.lowercaseAllLetters(inputString));
				break;
			case 5:
				System.out.println("Count words");
				System.out.println(Functions.countWords(inputString));
				break;
			case 6:
				System.out.println("Count letters");
				System.out.println(Functions.countLetters(inputString));
				break;
			case 7:
				System.out.println("Exit !!!");
				return ;
			default:
				System.out.println("Choose Again !!!");
			}
		}
	}
}
