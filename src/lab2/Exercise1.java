package lab2;

import java.util.Scanner;

public class Exercise1 {

	static int getSecondSmallest(int arr[]) {
		if(arr.length == 1)
			return arr[0];
		int mini = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= mini) {
				second = mini;
				mini = arr[i];
			} else if (arr[i] <= second) {
				second = arr[i];
			}
		}
		return second;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Second smallest element is: "+ getSecondSmallest(arr));
		sc.close();
	}
}
