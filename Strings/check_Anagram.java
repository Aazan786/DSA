// Java program to check if two
// strings are anagrams of each other
import java.io.*;
import java.util.*;

// Driver Class
class GFG {
	// main function
	public static boolean areAnagram(String a, String b)
	{
		// Check if both string has same length or not
		if (a.length() != b.length()) {
			return false;
		}

		// Creating a HashMap containing Character as Key
		// and Integer as Value. We will be storing
		// character as Key and count of character as Value.
		HashMap<Character, Integer> map = new HashMap<>();

		// Loop over all character of first string and put
		// in HashMap.
		for (int i = 0; i < a.length(); i++) {
			// Check if HashMap already contain the current
			// character or not
			if (map.containsKey(a.charAt(i))) {
				// If contains then increase count by 1
				map.put(a.charAt(i),
						map.get(a.charAt(i)) + 1);
			}
			else {
				// else put that character in map and set
				// count to 1 as character is encountered
				// first time
				map.put(a.charAt(i), 1);
			}
		}

		// Now loop over String b
		for (int i = 0; i < b.length(); i++) {

			// Check if HashMap already contain the current
			// character or not
			if (map.containsKey(b.charAt(i))) {

				// If contains reduce count of that
				// character by 1 to indicate that current
				// character has been already counted as
				// idea here is to check if in last count of
				// all characters in last is zero which
				// means all characters in String a are
				// present in String b.
				map.put(b.charAt(i),
						map.get(b.charAt(i)) - 1);
			}
		}

		// Extract all keys of HashMap/map
		Set<Character> keys = map.keySet();

		// Loop over all keys and check if all keys are 0
		// as it means that all the characters are present
		// in equal count in both strings.
		for (Character key : keys) {
			if (map.get(key) != 0) {
				return false;
			}
		}
		// Returning True as all keys are zero
		return true;
	}
	public static void main(String[] args)
	{
		String str1 = "geeksforgeeks";
		String str2 = "forgeeksgeeks";

		// Function call
		if (areAnagram(str1, str2))
			System.out.print("The two strings are "
							+ "anagram of each other");
		else
			System.out.print("The two strings are "
							+ "not anagram of each other");
	}
}
