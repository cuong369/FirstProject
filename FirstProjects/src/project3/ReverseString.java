package project3;

public class ReverseString {

	public static StringBuffer reverseStringInput(String input) {
		StringBuffer outputString = new StringBuffer();
		for(int i = input.length() - 1; i >= 0; i--) {
			outputString.append(input.charAt(i));
		}
		return outputString;
	}
}
