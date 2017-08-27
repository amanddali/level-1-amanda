import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		new CutenessTV().createUI();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton("ducks");
	JButton b2 = new JButton("frogs");
	JButton b3 = new JButton("fluffy unicorns");

	public void createUI() {

		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Cuteness TV");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed.equals(b1)) {
			showDucks();
		}
		if (buttonPressed.equals(b2)) {
			showFrog();
		}
		if (buttonPressed.equals(b3)) {
			showFluffyUnicorns();
		}
	}

}
