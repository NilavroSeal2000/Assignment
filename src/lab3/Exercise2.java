package lab3;

import java.util.Scanner;

public class Exercise2 {

	static String reverse(String word) {
		String rev = "";
		for (int i = word.length()-1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		System.out.println(word + '|' + reverse(word));
		sc.close();
	}
}
