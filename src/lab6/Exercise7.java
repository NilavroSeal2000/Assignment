package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {

	public static int[] getSorted(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int ele : arr) {
			String element = Integer.toString(ele);
			element = new StringBuilder(element).reverse().toString();
			list.add(Integer.parseInt(element));
		}

		Collections.sort(list);
		int[] result = list.stream().mapToInt(Integer::intValue).toArray();
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = getSorted(arr);
		System.out.println("Modified array is: ");
		for (int ele : ans) {
			System.out.print(" " + ele);
		}
		sc.close();
	}

}
