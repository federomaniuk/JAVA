package uso_frames_varios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JFrameSuccess extends JFrame implements ActionListener{
	
	JButton backBtn;
	public JLabel successLabel;
	public JTextField usuario;
	
	public JFrameSuccess() {
		setLayout(null);
		setTitle("Bienvenido");
		
		successLabel = new JLabel("Bienvenido");
		successLabel.setBounds(10,10,200,30);
		add(successLabel);
		
		usuario = new JTextField();
		usuario.setEditable(false);
		usuario.setBounds(100,10,200,30);
		add(usuario);
		
		backBtn = new JButton ("Volver");
		backBtn.setBounds(100, 100, 100, 30);
		add(backBtn);
		backBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento2) {
		if (evento2.getSource()==backBtn) {
			JFrame1 m1 = new JFrame1();
			m1.setVisible(true);
			m1.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}

}
