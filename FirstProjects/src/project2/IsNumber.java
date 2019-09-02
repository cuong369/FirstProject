package project2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsNumber {
	
	static boolean check(String N) {
		Pattern pattern = Pattern.compile("\\d*");
		Matcher matcher = pattern.matcher(N);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
}
