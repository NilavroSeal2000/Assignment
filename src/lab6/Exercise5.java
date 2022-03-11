package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	public static int getSecondSmallest(int[] arr) {
		if (arr.length == 1)
			return arr[0];
		List<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arrList.add(arr[i]);
		}

		Collections.sort(arrList);
		return arrList.get(1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int secondSmallest = getSecondSmallest(arr);
		System.out.println("Second smallest element is: " + secondSmallest);
		sc.close();
	}
}
