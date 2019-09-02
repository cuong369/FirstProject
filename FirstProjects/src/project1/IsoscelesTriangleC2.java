package project1;

import java.util.Scanner;

public class IsoscelesTriangleC2 {

	public static void printTriagle(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			if(i != 1)
				s += 2;
			for (int j = 1; j <= n * 2 - 1; j++) {
				int k = (n * 2 - 1 - s) / 2;
				if(j <= k || j > k + s)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of Triangle: ");
		int height = Integer.parseInt(sc.nextLine());
		printTriagle(height);
		sc.close();
	}
}
