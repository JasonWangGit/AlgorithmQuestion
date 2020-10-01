package KMP;

public class TestKMP {
	public static void main(String[] args) {
		String string = "abcxabcdabxabcdabcdabcy";
		String pattern =  "abcdabcy";
		int index = KMP.contains(string, pattern);
		System.out.println(index);
	}
}
