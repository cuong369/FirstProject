package project3;

import java.util.Scanner;

public class InAndOutString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String inputString = sc.nextLine();
		StringBuffer outputString = ReverseString.reverseStringInput(inputString);
		System.out.print(outputString);
		sc.close();
	}
}
