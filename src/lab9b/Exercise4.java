package lab9b;

class NameClass {
	String name;

	NameClass(String name) {
		this.name = name;
	}

	String m1(String name) {
		return (this.name + " " + name);
	}
}

@FunctionalInterface
interface Inf1 {
	String merge(String s);
}

public class Exercise4 {

	public static void main(String[] args) {
		NameClass ob = new NameClass("Nilavro");

		Inf1 m = ob::m1;
		System.out.println(m.merge("Seal"));

	}

}
