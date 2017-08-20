import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {
	
	public static void main(String[] args) {
		new DuelingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		leftButton.setText("Click me!");
		rightButton.setText("Click me!");
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		panel.add(leftButton);
		panel.add(rightButton);
		frame.pack();
		frame.setTitle("Demanding Buttons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		
		/* If the buttonPressed was the leftButton....*/
		if(buttonPressed.equals(leftButton)) {
			// Set the text of the rightButton to "No, click Me!"
			rightButton.setText("No, click Me!");
			// Set the PREFERRED size of the rightButton to BIG
			rightButton.setPreferredSize(BIG);
			// Set the text of the leftButton to "Click Me!"
			leftButton.setText("Click Me!");
			// Set the PREFERRED size of the leftButton to SMALL
			leftButton.setPreferredSize(SMALL);
		}
		
		/* If the buttonPressed was the rightButton, do the opposite. */
		if(buttonPressed.equals(rightButton)) {
			// Set the text of the rightButton to "No, click Me!"
			leftButton.setText("No, click Me!");
			// Set the PREFERRED size of the rightButton to BIG
			leftButton.setPreferredSize(BIG);
			// Set the text of the leftButton to "Click Me!"
			rightButton.setText("Click Me!");
			// Set the PREFERRED size of the leftButton to SMALL
			rightButton.setPreferredSize(SMALL);
		}

		frame.pack();
	}
}
