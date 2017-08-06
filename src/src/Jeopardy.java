 // Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.io.File;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton;
	
	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setTitle("Jeopardy");
		JPanel category = createHeader("Presidents");
		quizPanel.add(category);
		frame.add(quizPanel);
		firstButton = createButton("200");
		quizPanel.add(firstButton);
		secondButton = createButton("400");
		quizPanel.add(secondButton);
		thirdButton = createButton("600");
		quizPanel.add(thirdButton);
		fourthButton = createButton("800");
		quizPanel.add(fourthButton);
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount+1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height, Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * 13. Use the method provided to play the Jeopardy theme music 
	 * 
	 * 14. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
	 *
	 * [optional] Use the showImage or playSound methods when the user answers a question 
	 */
	
	private JButton createButton(String dollarAmount) {
		JButton newButton = new JButton();
		newButton.setText(dollarAmount);
		buttonCount ++;
		return newButton;
	}

	public void actionPerformed(ActionEvent arg0) {
		playJeopardyTheme();
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == firstButton){
			askQuestion("Who was the first president?" , "George Washington", 200);
			firstButton.setText("");
		}
		if(buttonPressed == secondButton){
			askQuestion("Which president resigned before being impeached?", "Richard Nixon", 400);
			secondButton.setText("");
		}
		if(buttonPressed == thirdButton){
			askQuestion("Who signed the Emancipation Proclamation?", "Abraham Lincoln", 600);
			thirdButton.setText("");
		}
		if(buttonPressed == fourthButton){
			askQuestion("Which president was never elected into office?", "Gerald Ford", 800);
			fourthButton.setText("");
		}
	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		String userAnswer = JOptionPane.showInputDialog(question);
		if( userAnswer.equalsIgnoreCase(correctAnswer)){
			score += prizeMoney;
			updateScore();
			JOptionPane.showMessageDialog(null, "Correct");
		}else{ 
			score -= prizeMoney;
			JOptionPane.showMessageDialog(null, correctAnswer);
			updateScore();
		}
	}


public void playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}

