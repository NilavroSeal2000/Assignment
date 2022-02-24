package lab2;

import java.util.Scanner;

public class Exercise3 {
	
	static int reverseDigit(int num) {
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		return rev;
	}
	
	static int[] getSorted(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = reverseDigit(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		return arr;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of element: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter elements: ");
	for(int i=0;i<n;i++)
	{
		arr[i] = sc.nextInt();
	}
	arr = getSorted(arr);
	System.out.println("Transformed Array is: ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i] + " ");
	}
	sc.close();
}
}
