import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame("Chuckle Clicker");
	JPanel panel = new JPanel();
	JButton joke = new JButton("Joke");
	JButton punchline = new JButton("Punchline");
	
	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
	}
	
	public void makeButtons(){
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Hi");
		if(e.getSource() == joke){
			JOptionPane.showMessageDialog(null, "What the difference between a snowman and a snowwoman?");
		} else if(e.getSource() == punchline){
			JOptionPane.showMessageDialog(null, "Snowballs");
		}
	}
}

