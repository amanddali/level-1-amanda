import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Fortune");


	public static void main(String[] args) {
		FortuneCookie cookie = new FortuneCookie();
		cookie.showButton();
	}
	
	public void showButton() {
		System.out.println("hjhvvihl");
		frame.setVisible(true);
		frame.add(button);
		button.addActionListener(this);
		frame.pack();		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button)) {
			System.out.println("Woohoo");
			int Random = new Random().nextInt(4);
			if (Random == 0) {
				JOptionPane.showMessageDialog(null, "You will eat taco bell in the next 24 hours!");
			} if (Random == 1) {
				JOptionPane.showMessageDialog(null, "You are going to get into an argument with your best friend");
			} if (Random == 2) {
				JOptionPane.showMessageDialog(null, "You will go on a four wheeled adventure");
			} if (Random == 3) {
				JOptionPane.showMessageDialog(null, "Luck is coming your way so keep your eyes open");
			} if (Random == 4) {
				JOptionPane.showMessageDialog(null, "Sorrow will soon arrive");
			}
		}
	}
}
