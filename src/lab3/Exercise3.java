package lab3;

import java.util.Scanner;

public class Exercise3 {

	static String convert(String word) {
		String ans = "";
		for(int i=0;i<word.length();i++)
		{
			switch(word.charAt(i))
			{
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				ans = ans + word.charAt(i);
				break;
			default:
				ans = ans + (char)(word.charAt(i) + 1);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.next();
		System.out.println(convert(word));
		sc.close();
	}
}
