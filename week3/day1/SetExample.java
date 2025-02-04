package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public void setExamples() {
		String companyName = "google";
		Set<Character> uniqueCharacters = new HashSet<>();
        for (char c : companyName.toCharArray()) {
            uniqueCharacters.add(c);
        }
        System.out.println("Unique characters: " + uniqueCharacters);
	}

	public static void main(String[] args) {
		SetExample set = new SetExample();
		set.setExamples();

	}

}
