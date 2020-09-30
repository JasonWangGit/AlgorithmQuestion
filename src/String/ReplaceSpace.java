package String;

import java.util.Scanner;

// Question description:
// Implement a function that replaces each space in a string with '%20'. 
// For example, if the string is We Are Happy. 
// Then the replaced string is We%20Are%20Happy.

public class ReplaceSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String string = scanner.nextLine();
			// System.out.println(replaceSpace(string));
			System.out.println(replaceSpaceWithAPI(string));
		}
		scanner.close();
	}
	
	public static String replaceSpace(String string) {
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0; i < string.length(); i ++) {
			if(string.charAt(i) == ' ') {
				stringBuffer.append("%20");
			} else {
				stringBuffer.append(string.charAt(i));
			}
		}
		return stringBuffer.toString();
	}
	
	public static String replaceSpaceWithAPI(String string) {
		return string.replaceAll(" ", "%20");
	}
}
