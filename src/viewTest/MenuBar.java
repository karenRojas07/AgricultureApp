package viewTest;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuBar extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton home;
	public JButton signin;
	public JButton login;
	
	public MenuBar() {
		setBackground(new Color(203, 229, 88));
		init();
	}
	
	public void init() {
		home = new JButton();
		signin = new JButton();
		login = new JButton();
		config();
	}
	
	public void config() {
		home.setBackground(new Color(203, 229, 88));
		home.setIcon(new ImageIcon("images/home.png"));
		home.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		home.setForeground(Color.WHITE);
//		home.setBorderPainted(false);
		home.setFocusable(false);
		home.setText("Inicio");
		add(home);
		
		signin.setBackground(new Color(203, 229, 88));
		signin.setIcon(new ImageIcon("images/regist.png"));
		signin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		signin.setForeground(Color.WHITE);
//		singin.setBorderPainted(false);
		signin.setFocusable(false);
		signin.setText("Registrarse");
		add(signin);
		
		login.setBackground(new Color(203, 229, 88));
		login.setIcon(new ImageIcon("images/user.png"));
		login.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		login.setForeground(Color.WHITE);
//		login.setBorderPainted(false);
		login.setFocusable(false);
		login.setText("Ingresar");
		add(login);
	}

}
