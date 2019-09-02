package project8;

import java.util.Scanner;

public class FindMultipleOf3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int inputNumber = Integer.parseInt(sc.nextLine());
		System.out.println(CheckMultipleOf3.checkMultipleOf3(inputNumber));
		sc.close();
	}
}
