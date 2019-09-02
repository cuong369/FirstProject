package project4;

import java.util.Map.Entry;
import java.util.Scanner;

public class OccurrencesOfEachLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String inputString = sc.nextLine();
		for(Entry<String, Integer> i: CalculatesLetter.numberLetter(inputString).entrySet()) {
			System.out.println(i.getKey() + ": " + i.getValue());
		}
		sc.close();
	}
}
