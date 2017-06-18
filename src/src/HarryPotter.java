public class HarryPotter {
 
	private boolean cloakOn;
	
	HarryPotter() {
		System.out.println("making Harry Potter...");
	}
 
	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}
 
	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}
 
	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}
 
	public static void main(String[] args) {
		HarryPotter harry = new HarryPotter();
		harry.makeInvisible(true);
		harry.spyOnSnape();
		harry.makeInvisible(false);
		harry.castSpell("stupefy");
	}
 
}
 
 
 
 
 
