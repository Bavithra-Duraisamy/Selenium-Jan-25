package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	
	public void findSecondLargestNumber() {
		List<Integer> intArray = new ArrayList<>();
		intArray.add(3);
		intArray.add(2);
		intArray.add(11);
		intArray.add(4);
		intArray.add(6);
		intArray.add(7);
		Collections.sort(intArray);
		System.out.println("Sorted array of numbers: "+ intArray);
		System.out.println();
		int size = intArray.size();
		System.out.println("The second largest number is: " + intArray.get(size - 2));
		
	}

	public static void main(String[] args) {
		FindSecondLargest sec = new FindSecondLargest();
		sec.findSecondLargestNumber();
	}
}
