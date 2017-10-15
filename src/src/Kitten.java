
public class Kitten {
	String name;
	int numberofSpots;
	String coatColor;
	String personality;
	static int numKittens = 0;

	public Kitten() {
		numKittens++;
	}

	public static void numKittens() {
		System.out.println(numKittens);
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}
}
