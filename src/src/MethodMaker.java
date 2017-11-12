public class MethodMaker {
	public static void main(String[] args) {
		MethodMaker methods = new MethodMaker();
		IRocks("Amanda");
		Truth("You");
		Repeat(10, "unicorns");
		TorF(7);
	}

	public static void IRocks(String name) {
		System.out.println(name + " rocks");
	}

	public static void Truth(String person) {
		System.out.println(person + " suck");
	}

	public static void Repeat(int number, String random) {
		for (int i = 0; i < number; i++) {
			System.out.println(random);
		}
	}

	public static boolean TorF(int number) {
		if (number % 2 == 0) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}
}