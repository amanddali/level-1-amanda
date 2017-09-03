import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField tf1 = new JTextField(20);
	JButton button = new JButton("convert");
	JTextField tf2 = new JTextField(20);
	
	public static void main(String[] args) {
		BinaryConverter BinaryConverter = new BinaryConverter();
		BinaryConverter.createUI();
	}

	public void createUI() {
		
		frame.setVisible(true);
		frame.setTitle("Give me binary or give me death!");
		frame.add(panel);
		panel.add(tf1);
		button.addActionListener(this);
		panel.add(button);
		panel.add(tf2);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		
		for( int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) != '0' && binary.charAt(i) !='1') {
				JOptionPane.showMessageDialog(null, "Binary!!");
			}
		}
		 
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	 String convert2(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			String answer = convert2(tf1.getText());
			//String text = Integer.toString(answer);
			tf2.setText(answer);
		}
	}
}
