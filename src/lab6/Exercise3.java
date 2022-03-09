package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {

	public static HashMap<Integer, Integer> getSquares(List<Integer> list) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (Integer key : list) {
			hashmap.put(key, key * key);
		}
		return hashmap;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter number of elements: ");
		n = sc.nextInt();
		System.out.println("Enter elements: ");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		HashMap<Integer, Integer> hashmap = getSquares(list);

		hashmap.forEach((key, value) -> System.out.println("Key : " + key + " Value: " + value));

		sc.close();
	}

}
