package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;

public class MainTela extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainTela frame = new MainTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainTela() {
		setBackground(Color.BLACK);
		setTitle("Bem-Vindo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("Senha: ");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAcessarButton = new JButton("Acessar");
		btnAcessarButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAcessarButton.setForeground(Color.BLACK);
		btnAcessarButton.setBounds(107, 148, 89, 23);
		contentPane.add(btnAcessarButton);
		
		JButton btnCadastrarButton = new JButton("Cadastrar");
		btnCadastrarButton.setBounds(248, 148, 89, 23);
		contentPane.add(btnCadastrarButton);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(107, 64, 230, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setToolTipText("");
		passwordField.setBounds(107, 117, 230, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(107, 39, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(107, 92, 46, 14);
		contentPane.add(lblNewLabel_1);
	}
}
