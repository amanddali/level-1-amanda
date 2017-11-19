import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();

	JFrame frame = new JFrame("Type or Die");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String letter = "";

	public static void main(String[] args) {
		TypingTutor type = new TypingTutor();
		type.createUI();
	}

	public void createUI() {
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		letter += currentLetter;
		label.setText(letter);
		frame.setVisible(true);
		panel.setPreferredSize(new Dimension(350, 150));
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		String save = "";
		save += c;
		System.out.println(letter);
		System.out.println("you typed: " + save);
		if (save.equals(letter)) {
			System.out.println("correct");
			panel.setBackground(Color.GREEN);
		} else {
			panel.setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		letter = "";
		letter += currentLetter;
		label.setText(letter);
	}
}
