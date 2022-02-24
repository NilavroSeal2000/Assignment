package lab1;

import java.util.Scanner;

public class Exercise8 {

	static boolean isPowerOfTwo(int num) {
		while(num>2)
		{
			if(num%2 == 1)
				return false;
			num = num/2;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if (isPowerOfTwo(n)) {
			System.out.println("Power of two");
		} else {
			System.out.println("Not a power of two ");
		}
		sc.close();
	}

}
