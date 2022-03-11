package lab6;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise6 {

	public static List<String> votersList(HashMap<String, LocalDate> score) {

		List<String> id = new ArrayList<>();
		LocalDate date = LocalDate.now();

		score.forEach((key, value) -> {
			Period p = Period.between(value, date);
			if (p.getYears() >= 18)
				id.add(key);
		});
		return id;
	}

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of voters: ");
		int n = sc.nextInt();
		sc.nextLine();
		HashMap<String, LocalDate> score = new HashMap<String, LocalDate>();
		System.out.println("Enter Voter details: ");
		for (int index = 0; index < n; index++) {
			System.out.println("\nEnter ID: ");
			String key = sc.nextLine();
			System.out.println("Enter DOB as DD/MM/YYYY format: ");
			String userdate = sc.nextLine();
			StringTokenizer tokens = new StringTokenizer(userdate, "/");
			int dateformat[] = new int[3];
			int i = 0;
			while (tokens.hasMoreTokens()) {
				dateformat[i++] = Integer.parseInt(tokens.nextToken());
			}
			LocalDate date1 = LocalDate.of(dateformat[2], dateformat[1], dateformat[0]);
			score.put(key, date1);
		}

		List<String> result = votersList(score);

		System.out.println("The list of eligible ID is: ");
		result.forEach((id) -> System.out.println(id));

		sc.close();
	}
}
