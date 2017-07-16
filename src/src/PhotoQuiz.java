
 // Copyright Wintriss Technical Schools 2013

import java.awt.Component;
import java.awt.Frame;
import java.awt.GridLayout;
import java.net.MalformedURLException;
import java.net.URL;
 
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class PhotoQuiz {
 
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
 
		String imageOne ="http://www.lostsurfboards.net/wp-content/uploads/2015/04/shortround-3d-surfboard-2015.png";
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setTitle("Photo Quiz");
		createImage(imageOne);
		frame.add(createImage(imageOne));
		frame.pack();
		String answerOne = JOptionPane.showInputDialog("Can you use it in the sand?");
		if(answerOne.equalsIgnoreCase("no")){
			JOptionPane.showMessageDialog(null, "Correct");
		} else{
			JOptionPane.showMessageDialog(null, "Incorrect");
		} 
		frame.remove(createImage(imageOne));
		// 10. find another image and create it (might take more than one line of code)
		String imageTwo = "https://www.google.com/imgres?imgurl=http%3A%2F%2Fimages.selfridges.com%2Fis%2Fimage%2Fselfridges%2F317-77011643-LUMSILKFDT_425_M%3F%24PDP_M_ALL%24&imgrefurl=http%3A%2F%2Fwww.selfridges.com%2FUS%2Fen%2Fcat%2Fgiorgio-armani-luminous-silk-foundation_317-77011643-LUMSILKFDT%2F&docid=LNHjqKx7DptsmM&tbnid=Ryd8yWDM4fe71M%3A&vet=10ahUKEwjB2vT-747VAhVk04MKHXX9C6QQMwj5ASgIMAg..i&w=444&h=492&bih=828&biw=1432&q=giorgio%20armani%20luminous%20silk%20foundation&ved=0ahUKEwjB2vT-747VAhVk04MKHXX9C6QQMwj5ASgIMAg&iact=mrc&uact=8";
		createImage(imageTwo);
		// 11. add the second image to the quiz window
		frame.add(createImage(imageTwo));
		// 12. pack the quiz window
		frame.pack();
		// 13. ask another question
		JOptionPane.showInputDialog("Can you make yourself look better with this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(answerOne.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null, "Correct");
		} else{
			JOptionPane.showMessageDialog(null, "Incorrect");
		} 
	}
 
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
 
	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}
 
 
 
 
