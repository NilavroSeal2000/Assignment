package lab2;

import java.util.Scanner;

public class Exercise4 {

	static int[] modifyArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] < arr[j])
				{
					arr[i] = arr[j] + arr[i];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		
		int unique = 0;
		for(int i=0;i< arr.length - 1;i++)
		{
			if(arr[i] != arr[i+1])
				{
					unique++;
				}
		}
		
		if(arr[arr.length - 1] != arr[arr.length - 2])
		{
			unique++;
		}
		
		int j = 0;
		int ans[] = new int[unique];
		for(int i=0;i<arr.length - 1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				ans[j++] = arr[i];
			}
		}
		if(arr[arr.length - 1] != arr[arr.length - 2])
		{
			ans[j++] = arr[arr.length - 1];
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		arr = modifyArray(arr);
		System.out.println("Transformed Array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
