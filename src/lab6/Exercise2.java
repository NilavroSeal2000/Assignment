package lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {

	public static HashMap<Character, Integer> countChars(char[] arr) {
		HashMap<Character, Integer> ans = new HashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (ans.containsKey(arr[i]))
				continue;
			else {
				int total = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j])
						total++;
				}
				ans.put(arr[i], total);
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		char[] ch = { 'a', 'e', 'i', 'z', 'e', 'z', 'z' };
		HashMap<Character, Integer> ans = Exercise2.countChars(ch);
		for (Map.Entry<Character, Integer> h : ans.entrySet()) {
			System.out.println(h);
		}
	}
}
