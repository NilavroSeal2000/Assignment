package lab1;


import java.util.Scanner;

public class Exercise5 {
	
	public static int calculateSum(int n)
	{
		/**
		 * Calculate the sum of first n natural numbers which are divisible by 3 or 5. 
		 */
		int total = 0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5 == 0)
				total+=i;
		}
		return total;
	}
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the natural number: ");
	int n = sc.nextInt();
	System.out.printf("sum of first %d natural numbers which are divisible by 3 or 5 is: %d",n,calculateSum(n));
	sc.close();
}
}