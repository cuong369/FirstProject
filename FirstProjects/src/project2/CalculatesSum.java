package project2;

import java.util.Scanner;

public class CalculatesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter N: ");
		String n = sc.nextLine();
		boolean result = IsNumber.check(n);
		while(result == false) {
			if(result == false) {
				System.out.println("N must be a number!");
				System.out.print("Please enter N: ");
			}
			n = sc.nextLine();
			result = IsNumber.check(n);
		}
		int N = Integer.parseInt(n);
		int sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += i;
		}
		System.out.println("Sum of 1.." + N + " is: " + sum);
		sc.close();
	}
}
