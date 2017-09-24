
public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if (this.getName().equals("My name is Papa Smurf.")) {
			return "Red Hat";
		} else {
			return "White Hat";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if (this.getName().equals("My name is Smurfette Smurf.")) {
			return "Girl";
		} else {
			return "Boy";
		}
	}

}
