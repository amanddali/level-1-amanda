import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BinaryConverter {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		System.out.println(new BinaryConverter().convert("01001001"));
	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		/*
		 * if (!Pattern.matches("\2", binary)) {
		 * JOptionPane.showMessageDialog(null,
		 * "Binary can only contain 1s or 0s, silly!!!"); return 0; }
		 */
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}
}
