package br.sc.senac.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.Font;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JPasswordField passwordSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/imagens/fundo_telaprincipal.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(119, 72, 53, 27);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(154, 75, 141, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnButtonAcessar = new JButton("Acessar");
		btnButtonAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema");
			}
		});
		btnButtonAcessar.setBounds(168, 147, 89, 33);
		contentPane.add(btnButtonAcessar);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(112, 113, 46, 14);
		contentPane.add(lblSenha);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(154, 110, 141, 20);
		contentPane.add(passwordSenha);
		
		JLabel lblTelaDeLogin = new JLabel("TELA DE LOGIN");
		lblTelaDeLogin.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblTelaDeLogin.setBounds(138, 26, 157, 27);
		contentPane.add(lblTelaDeLogin);
	}
}
