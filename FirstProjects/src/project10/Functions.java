package project10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Functions {

	public static String reverseString(String inputString) {
		String reverseString = "";
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverseString += inputString.charAt(i);
		}
		return reverseString;
	}

	public static String uppercaseAllLetters(String inpString) {
		return inpString.toUpperCase();
	}

	public static String lowercaseAllLetters(String inpString) {
		return inpString.toLowerCase();
	}
	
	public static int countWords(String inString) {
		return inString.split(" ").length;
	}
	
	public static int countLetters(String inString) {
		int count = 0;
		Pattern pattern = Pattern.compile("[A-z]");
		for(String i: inString.split("")) {
			Matcher matcher = pattern.matcher(i);
			if(matcher.matches())
				count ++;
		}
		return count;
	}
}
