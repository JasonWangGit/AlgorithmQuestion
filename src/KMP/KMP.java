package KMP;

// Knuth-Morris-Pratt Algorithm
public class KMP {
	public static int contains(String string, String pattern) {
		// PMT stands for: Partial Match Table
		int lengthString = string.length();
		int lengthPattern = pattern.length();
		int indexString = 0;
		int indexPattern = 0;
		int indexPMT = 1;
		int[] PMT = new int[lengthPattern + 1];
		int tempPMT = 0;
		int tempIndex = 1;
		
		PMT[0] = -1;
		while(indexPMT < lengthPattern && indexPattern < lengthPattern) {
			if(pattern.charAt(indexPMT) == pattern.charAt(indexPattern)) {
				tempPMT++;
				indexPattern++;
				indexPMT++;
			} else {
				tempPMT = 0;
				indexPattern++;
				indexPMT = 0;
			}
			PMT[tempIndex++] = tempPMT;
		}
		
		for(int i : PMT) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		indexPattern = 0;
		while(indexString < lengthString && indexPattern < lengthPattern) {
			if(indexPattern == -1 || string.charAt(indexString) == pattern.charAt(indexPattern)) {
				indexString++;
				indexPattern++;
			} else {
				indexPattern = PMT[indexPattern];
			}
		}
		if(indexPattern == lengthPattern) {
			return indexString - indexPattern;
		} else {
			return -1;
		}
	}
}
