package lab3;

import java.util.Scanner;

public class Exercise4 {

	static int modified(int n) {
		String num = Integer.toString(n);
		int ans = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num.length() - 1; i++) {
			int dif = num.charAt(i) - num.charAt(i + 1);
			dif = Math.abs(dif);
			sb.append(Integer.toString(dif));
		}
		sb.append(num.charAt(num.length() - 1));
		ans = Integer.parseInt(sb.toString());
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Modified number is: "+Exercise4.modified(num));
		sc.close();
	}
}
