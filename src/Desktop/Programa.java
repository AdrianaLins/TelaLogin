package Desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Programa {

	public static void main(String[] args) {

		/*
		 * Simulando uma tela de login...
		 */

		final String USUARIO = "adriana";
		final String SENHA_USUARIO = "java";

		/*
		 * Biblioteca Java.swing vem incorporada no JAVA para criar aplica��es Desktop
		 */

		// Criando a tela
		JFrame frame = new JFrame("Pecorelli Tec's :: Acesso ao Sistema"); // T�tulo da Tela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quando clica no 'x' fecha a tela de login, para a
																// aplica��o;

		// JPanel fica dentro da tela AGRUPANDO os elementos dentro da janela
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS)); // Para fazer o agrupamento dos elementos na tela

		// Definindo os componentes que v�o ficar no painel
		JLabel lblUsuario = new JLabel("Usu�rio: ");
		JTextField txtUsuario = new JTextField(24); // JTextField � um campo de entrada de texto, onde o usu�rio digita
													// a informa��o
		txtUsuario.setToolTipText("Informe seu usu�rio de acesso");

		JLabel lblSenha = new JLabel("Senha: ");
		JPasswordField txtSenha = new JPasswordField(24);
		txtSenha.setToolTipText("Informe sua senha de acesso");

		// Criando um bot�o
		JButton btnLogin = new JButton("Login");

		/*
		 * Definindo o Evento(quando clicar no bot�o login, pega o texto do usu�rio e
		 * senha, verifica se � igual, se for igual, acesso autorizado, caso contr�rio,
		 * acesso negado). Colocando a a��o no bot�o!
		 */
		btnLogin.addActionListener(new ActionListener() { //Ouvidor da a��o!(ActionListener)

			@Override // quando o bot�o for clicado, vai acontecer o que tiver dentro desse m�todo
			public void actionPerformed(ActionEvent e) {
				if (txtUsuario.getText().equals(USUARIO) && new String(txtSenha.getPassword()).equals(SENHA_USUARIO)) {
					JOptionPane.showMessageDialog(frame, "Acesso autorizado!");
				} else {
					JOptionPane.showMessageDialog(frame, "Acesso negado!");
				}

			}

		});

		// Colocando o lblUsuario/lblSenha/btnLogin para agrupar dentro do
		// painel(JPanel)
		panel.add(lblUsuario);
		panel.add(txtUsuario);

		panel.add(lblSenha);
		panel.add(txtSenha);

		panel.add(btnLogin);

		// Informando ao JFrame quem � o panel...
		frame.setContentPane(panel); // adicionado o panel na tela...
		frame.pack(); // Empacota tudo... fixa...
		frame.setVisible(true); // Para que seja vis�vel. Por padr�o a tela � invis�vel

	}

}
