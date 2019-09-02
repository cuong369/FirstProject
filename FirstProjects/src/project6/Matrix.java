package project6;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st dimension: ");
		int width = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the 2nd dimension: ");
		int height = Integer.parseInt(sc.nextLine());
		int[][] matrix = new int[height][width];
		int[][] matrixChange = new int[height][width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("Enter value for element [" + i + ", " + j + "]: ");
				matrix[i][j] = Integer.parseInt(sc.nextLine());
				if (matrix[i][j] % 2 == 0)
					matrixChange[i][j] = 0;
				else
					matrixChange[i][j] = 1;
			}
			System.out.println();
		}

		// print
		System.out.print("Input:\t\t");
		System.out.println("Output:");
		for (int i = 0; i < height; i++) {
			System.out.print("[");
			for (int j = 0; j < width; j++) {
				if (j != width - 1)
					System.out.print(matrix[i][j] + ",");
				else
					System.out.print(matrix[i][j]);
			}
			System.out.print("]\t");
			System.out.print("\t[");
			for (int j = 0; j < width; j++) {
				if (j != width - 1)
					System.out.print(matrixChange[i][j] + ",");
				else
					System.out.print(matrixChange[i][j]);
			}
			System.out.print("]");
			System.out.println();

		}
		sc.close();
	}
}
