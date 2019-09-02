package project9;

import java.util.List;

public class Calculate {

	public static float AverageOfAllOdd(List<Integer> listNumbers) {
		int j = 0;
		float sum = 0;
		for (int i : listNumbers) {
			if (i % 2 != 0) {
				++j;
				sum += i;
			}
		}
		return sum / j;
	}

	public static float AverageOfAllEven(List<Integer> listNumbers) {
		int j = 0;
		float sum = 0;
		for (int i : listNumbers) {
			if (i % 2 == 0) {
				++j;
				sum += i;
			}
		}
		return sum / j;
	}

	public static int FindBiggestNumber(List<Integer> listNumbers) {
		int max = listNumbers.get(0);
		for(int i: listNumbers) {
			if(i > max)
				max = i;
		}
		return max;
	}

	public static int FindSmallestNumber(List<Integer> listNumbers) {
		int min = listNumbers.get(0);
		for(int i: listNumbers) {
			if(i < min)
				min = i;
		}
		return min;
	}
}
