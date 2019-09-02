package project9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateAndPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N = ");
		int N = Integer.parseInt(sc.nextLine());
		List<Integer> listNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			System.out.print("Enter number #" + i + ": ");
			listNumbers.add(Integer.parseInt(sc.nextLine()));
		}
		System.out.println("Average of all odd numbers: " + Calculate.AverageOfAllOdd(listNumbers));
		System.out.println("Average of all even numbers: " + Calculate.AverageOfAllEven(listNumbers));
		System.out.println("The biggest number: " + Calculate.FindBiggestNumber(listNumbers));
		System.out.print("The smallest number: " + Calculate.FindSmallestNumber(listNumbers));
		
		sc.close();
	}
}
