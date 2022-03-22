package lab9b;

@FunctionalInterface
interface Mark {
	public String power(String a);
}

public class Exercise2 {
	public static void main(String[] args) {
		Mark s1 = (a) -> {
			String[] str = a.split("");
			String out = "";
			for (String i : str) {
				out = out + i + " ";
			}
			return out;

		};
		System.out.println(s1.power("CG"));
	}

}