package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] a = {1,4,3,2,8,6,7};
		Arrays.sort(a);
		for(int i = 0; i< a.length; i++) {
			if(a[i] != i + 1) {
				System.out.println("Missing element is: " + (i + 1));
				break;
			}
		}
	}

}
