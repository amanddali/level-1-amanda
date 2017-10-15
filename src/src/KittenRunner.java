
public class KittenRunner {
	public static void main(String[] args) {
		Kitten k1 = new Kitten();
		k1.name = "cow";
		k1.coatColor = "white";
		k1.numberofSpots = 7;
		k1.personality = "dumb";
		Kitten k2 = new Kitten();
		k2.name = "lucky";
		Kitten.numKittens();
		System.out.println(k1.setName("oreo"));
	}
}
