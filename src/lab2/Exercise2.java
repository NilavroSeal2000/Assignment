package lab2;

import java.util.Scanner;

public class Exercise2 {
	
	static String[] transform(String arr[])
	{
		for(int i=0;i<arr.length - 1;i++)
		{
			for(int j = i + 1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j]) > 0)
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<= (arr.length-1)/2)
				arr[i] = arr[i].toUpperCase();
			else
				arr[i] = arr[i].toLowerCase();
		}
		return arr;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number words: ");
	int n = sc.nextInt();
	String arr[] = new String[n];
	for(int i=0;i<n;i++)
	{
		arr[i] = sc.next();
	}
	String ans[] = transform(arr); 
	for(String word : ans)
		System.out.print(word+" ");
	sc.close();
}
}
