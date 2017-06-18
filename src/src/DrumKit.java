
// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumLabelWithImage;
	JLabel cymbalLabelWithImage;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setTitle("Drum Kit");
		JPanel panel = new JPanel();
		frame.add(panel);
		String drum = "drum.jpg";
		String cymbal = "cymbal.jpg";
		drumLabelWithImage = createLabelImage(drum);
		cymbalLabelWithImage = createLabelImage(cymbal);
		panel.add(drumLabelWithImage);
		panel.add(cymbalLabelWithImage);
		panel.setLayout(new GridLayout());
		frame.pack();
		drumLabelWithImage.addMouseListener(this);
		cymbalLabelWithImage.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("mouse clicked");
		if (e.getSource() == drumLabelWithImage) {
			JLabel drumClicked = (JLabel) e.getSource();
			playSound("drumsound.wav");
		} else if (e.getSource() == cymbalLabelWithImage) {
			JLabel drumClicked = (JLabel) e.getSource();
			playSound("cymbalsound.wav");
		}
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String drumsounds) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(drumsounds));
		sound.play();
	}

}
