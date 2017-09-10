import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	static final String FAKE_USERNAME = "yourfriendlyonionring";
	static final String FAKE_PASSWORD = "imnevergonnausethisaccountbecauseitsstupid";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField type = new JTextField(20);
	JButton b1 = new JButton("BAD");
	JButton b2 = new JButton("GOOD");
	String message = "Hello friend, it is your friendly onion ring:)";
	String subject = "Hello";
	String recipient = "keith.groves@jointheleauge.org";
	static Spamalot spam;

	public static void main(String[] args) {
		spam = new Spamalot();
		spam.createUI();
	}

	public void createUI() {
		frame.setVisible(true);
		frame.setTitle("Spamalot");
		frame.add(panel);
		panel.add(type);
		panel.add(b1);
		panel.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			spam.sendSpam(spam.recipient, spam.subject, spam.message);
		}
		
	}

}
