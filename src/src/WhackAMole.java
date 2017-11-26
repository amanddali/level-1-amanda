import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JButton moleB;
	static Random r;
	static int random;
	static Date startTime;
	static int whacked;

	public static void main(String[] args) {
		startTime = new Date();
		whacked = 1;
		WhackAMole mole = new WhackAMole();
		r = new Random();
		random = r.nextInt(24);
		mole.drawButtons(random);
	}

	public void drawButtons(int random) {
		frame = new JFrame("Whack a Button for Fame and Glory");
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		for (int i = 0; i < 24; i++) {
			if (i == random) {
				moleB = new JButton("mole!");
				moleB.addActionListener(this);
				panel.add(moleB);
			} else {
				JButton button = new JButton();
				panel.add(button);
				button.addActionListener(this);
			}
		}
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(moleB)) {
			System.out.println(whacked++);
			frame.dispose();
			random = r.nextInt(24);
			drawButtons(random);
		} else if (!e.getSource().equals(moleB)) {
			speak("you are a dork");
		}
		if (whacked == 10) {
			endGame(startTime, whacked);
			frame.dispose();
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

}
