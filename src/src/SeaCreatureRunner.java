
public class SeaCreatureRunner {
	SeaCreature spongebob = new SeaCreature("Spongebob");
	SeaCreature patrick = new SeaCreature("Patrick");
	SeaCreature squidward = new SeaCreature("Squidward");

	public static void main(String[] args) {
		SeaCreatureRunner runner = new SeaCreatureRunner();
		runner.run();
	}

	public void run() {
		spongebob.eat();
		spongebob.laugh();
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
	}
}
