package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {
	
	public void interSection() {
		List<Integer> array1 = new ArrayList<>();
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		List<Integer> array2 = new ArrayList<>();
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		Collections.sort(array1);
		Collections.sort(array2);
		System.out.println(array1.size());
		System.out.println(array2.size());
		for(int i = 0; i < array1.size(); i++) {
			for(int j = 0; j < array2.size(); j++) {
				if(array1.get(i) == array2.get(j)) {
					System.out.println("Numbers are equal "+ array1.get(i) + array2.get(j));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FindIntersection inter = new FindIntersection();
		inter.interSection();
	}
}
