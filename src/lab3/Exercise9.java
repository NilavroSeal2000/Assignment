package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		System.out.println("Current Date: " + date);

		System.out.println("Enter date as DD/MM/YYYY format: ");
		String userdate = sc.next();
		StringTokenizer tokens = new StringTokenizer(userdate, "/");
		int dateformat[] = new int[3];
		int i = 0;
		while (tokens.hasMoreTokens()) {
			dateformat[i++] = Integer.parseInt(tokens.nextToken());
		}
		LocalDate date1 = LocalDate.of(dateformat[2], dateformat[1], dateformat[0]);
		System.out.println("User Date: " + date1);
		Period p = Period.between(date, date1);
		System.out.println(
				"The difference is: " + p.getYears() + " years "+ p.getMonths() + " months "+ p.getDays() + " days ");
		sc.close();
	}
}
