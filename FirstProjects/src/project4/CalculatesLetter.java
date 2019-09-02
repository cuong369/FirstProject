package project4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CalculatesLetter {

	public static Map<String, Integer> numberLetter(String inputString) {
		Set<String> calculates = new HashSet<String>();
		for (String i : inputString.split("")) {
			if (i.equals(" "))
				continue;
			calculates.add(i);
		}
		Map<String, Integer> result = new HashMap<String, Integer>();
		for (String j : calculates) {
			int s = 0;
			for (String i : inputString.split("")) {
				if(i.equals(" "))
					continue;
				if (i.equals(j)) {
					result.put(j, ++ s);
				}
			}
		}
		return result;
	}
}
