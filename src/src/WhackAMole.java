import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {

	public static void main(String[] args) {
		WhackAMole mole = new WhackAMole();
		mole.drawButtons();
	}

	public void drawButtons() {
		JFrame frame = new JFrame("Whack a Button for Fame and Glory");
		JPanel panel = new JPanel();
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
		}
		frame.setSize(300, 350);
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
