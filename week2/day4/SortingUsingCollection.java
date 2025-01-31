package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public void sortingWithCollection() {
		List<String> companyNames = new ArrayList<>();
		companyNames.add("HCL");
		companyNames.add("Wipro");
		companyNames.add("Aspire Systems");
		companyNames.add("CTS");
		System.out.println("Companies in the array list are: "+ companyNames);
		Collections.sort(companyNames);
		System.out.println("Companies in the array list after sorting are: "+ companyNames);
		System.out.println(companyNames.size());
		for(int i = companyNames.size() - 1; i >= 0; i--) {
			String latestCompanyName = companyNames.get(i);
			System.out.println(latestCompanyName);
		}
		
	}

	public static void main(String[] args) {
		SortingUsingCollection sorting = new SortingUsingCollection();
		sorting.sortingWithCollection();
	}

}
