import javax.swing.JOptionPane;

public class Penguin {
	boolean isFat;
	int height;
	
	public Penguin(boolean weight, int tall){
		isFat = weight;
		height = tall;
	}
	
	void starvingPenguin(){
		if(this.isFat == true){
			this.isFat  = false;
		}
		else{
			JOptionPane.showMessageDialog(null,"The penguin is already skinny");
		}
	}
	
	public static void main(String[] args) {
		Penguin Penny = new Penguin(true, 10);
		Penny.starvingPenguin();
		Penny.starvingPenguin();

	}
}
