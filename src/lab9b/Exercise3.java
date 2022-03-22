package lab9b;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Authentication {
	public boolean check(String name, String password);
}

public class Exercise3 {

	public static void main(String[] args) {
		Authentication match = (a, b) -> {
			Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z\\d]+{5,10}$");
			Matcher m = p.matcher(a);
			Pattern p1 = Pattern.compile("^[a-zA-z\\d]{1,8}[@][a-z1-9]{1,5}$");
			Matcher m1 = p1.matcher(b);
			if (m.find()) {
				if (m1.find()) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		};

		System.out.println(match.check("Nilavro2000", "Ami#Bolbona404"));

	}

}
