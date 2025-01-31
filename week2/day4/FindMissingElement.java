package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public void findMissingElement() {
		List<Integer> array1 = new ArrayList<>();
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		array1.add(10);
		array1.add(6);
		array1.add(8);
		Collections.sort(array1);
		System.out.println(array1);
		int size = array1.size();
		//System.out.println(array1.get(size - 1));
		for (int i = 0; i <= array1.size() - 2; i++) {
			int currentElement = array1.get(i);
			int nextElement = array1.get(i + 1);
			if (nextElement != currentElement + 1) {
				System.out.println(currentElement + 1);
			}
		}

	}

	public static void main(String[] args) {
		FindMissingElement el = new FindMissingElement();
		el.findMissingElement();

	}

}
