package project1;

import java.util.Scanner;

public class IsoscelesTriangleC1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of the isosceles triangle: ");
		int height = sc.nextInt();
		System.out.print("Enter width of the isosceles triangle: ");
		int width = sc.nextInt();
		while(width != height * 2 - 1) {
			System.out.println("Please enter width again!!! (width = height * 2 -1 )");
			System.out.print("Enter width of the isosceles triangle: ");
			width = sc.nextInt();
		}
		for(int i = 0; i < height; i++) {
			for(int j = 1; j <= width; j++) {
				if(j >= height - i && j <= height + i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
