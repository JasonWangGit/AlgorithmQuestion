package String;

import java.util.Arrays;
import java.util.Scanner;

//Question description: 
// Write a function to find the longest public prefix in an array of strings. 
// Returns an empty string "" if no common prefix exists.

public class LongestPublicPrefix {
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// while(scanner.hasNext()) {
			// String string = scanner.nextLine();
			String[] strings = { "flower", "flow", "flight" };
			System.out.println(findLongestPublicPrefix(strings));
		// }
		// scanner.close();
	}
	
	public static String findLongestPublicPrefix(String[] strings) {
		Arrays.sort(strings);
		if(strings[0] == null) {
			return "";
		} else {
			int i = 0;
			StringBuffer stringBuffer = new StringBuffer();
			while(i < strings[0].length() && i < strings[strings.length - 1].length()) {
				if(strings[0].charAt(i) == strings[strings.length - 1].charAt(i)) {
					stringBuffer.append(strings[0].charAt(i));
					i++;
				} else {
					break;
				}
			}
			return stringBuffer.toString();
		}
	}
}
