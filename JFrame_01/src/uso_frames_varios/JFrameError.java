package uso_frames_varios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JFrameError extends JFrame implements ActionListener{
	
	JButton backBtn;
	private static JLabel errorLabel;
	
	public JFrameError() {
		setLayout(null);
		setTitle("Error");
		setSize(300, 300);
		
		errorLabel = new JLabel("Usuario o password incorrecta");
		errorLabel.setBounds(10,10,200,30);
		add(errorLabel);

		backBtn = new JButton ("Volver");
		backBtn.setBounds(100, 100, 100, 30);
		add(backBtn);
		backBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento2) {
		if (evento2.getSource()==backBtn) {
			JFrame1 m1 = new JFrame1();
			m1.setSize(300, 300);
			m1.setLocationRelativeTo(null);
			m1.setVisible(true);
			this.setVisible(false);
		}
	}

}
