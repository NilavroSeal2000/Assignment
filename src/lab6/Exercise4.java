package lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise4 {

	public static HashMap<String, String> getStudents(HashMap<String, Integer> score) {
		HashMap<String, String> result = new HashMap<String, String>();

		score.forEach((key, value) -> {
			if (value >= 90)
				result.put(key, "Gold");
			else if (value >= 80)
				result.put(key, "Silver");
			else if (value >= 70)
				result.put(key, "Bronze");
		});
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		sc.nextLine();
		HashMap<String, Integer> score = new HashMap<String, Integer>();
		System.out.println("Enter student details: ");
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter student name: ");
			String key = sc.nextLine();
			System.out.println("Enter student performance: ");
			int value = sc.nextInt();
			sc.nextLine();
			score.put(key, value);
		}

		HashMap<String, String> result = getStudents(score);

		result.forEach((key, value) -> System.out.println(key + " will get " + value));

		sc.close();
	}
}
