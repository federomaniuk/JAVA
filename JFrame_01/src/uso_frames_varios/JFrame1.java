package uso_frames_varios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JFrame1 extends JFrame implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame1 formularioLogin = new JFrame1();
		formularioLogin.setSize(300, 300);
		formularioLogin.setLocationRelativeTo(null);
		formularioLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formularioLogin.setVisible(true);
	}
	
	JButton loginBtn;
	public JLabel userLabel;
	public JTextField userText;
	public JLabel passLabel;
	public JPasswordField passText;
	public JLabel error;
	
	public JFrame1() {
		setLayout(null);
		setTitle("Iniciar Sesión");
		setSize(300, 300);
		
		userLabel = new JLabel("Usuario");
		userLabel.setBounds(10,10,100,30);
		add(userLabel);
		
		userText = new JTextField();
		userText.setBounds(85,10,100,30);
		add(userText);
		
		passLabel = new JLabel("Contraseña");
		passLabel.setBounds(10,50,100,30);
		add(passLabel);

		passText = new JPasswordField();
		passText.setBounds(85,50,100,30);
		add(passText);

		loginBtn = new JButton ("Iniciar Sesión");
		loginBtn.setBounds(30, 100, 150, 30);
		add(loginBtn);
		loginBtn.addActionListener(this);

		error = new JLabel("");
		error.setBounds(10, 75, 100, 30);
	}

	@Override
	public void actionPerformed(ActionEvent evento1) {
		String user = userText.getText();
		String password = passText.getText();
		System.out.println("Usuario: " + user + ", Contraseña: " + password);
		
		if(user.equals("user") && password.equals("password")) {
			System.out.println("Login");
			JFrameSuccess successFrame = new JFrameSuccess();
			successFrame.setVisible(true);
			successFrame.setSize(300, 300);
			successFrame.setLocationRelativeTo(null);
			successFrame.usuario.setText(user);
			this.setVisible(false);
		} else if(user.equals("") || passText.equals("")) {
			JOptionPane.showMessageDialog(error, "Se requieren usuario y contraseña");
		} else {
			JFrameError errorFrame = new JFrameError();
			errorFrame.setVisible(true);
			errorFrame.setSize(300, 300);
			errorFrame.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}

}
