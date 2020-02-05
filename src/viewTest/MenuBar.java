package viewTest;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import constants.ConstantsLanguage;
import general.HandlerLanguage;

public class MenuBar extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton home;
//	public JButton signin;
//	public JButton login;
	public JButton date;
	public JButton reports;
	
	public MenuBar() {
		setBackground(new Color(203, 229, 88));
		init();
	}
	
	public void init() {
		home = new JButton();
		date = new JButton();
		reports = new JButton();
//		signin = new JButton();
//		login = new JButton();
		config();
	}
	
	public void config() {
		home.setBackground(new Color(203, 229, 88));
		home.setIcon(new ImageIcon("images/home.png"));
		home.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		home.setForeground(Color.WHITE);
		home.setFocusable(false);
		home.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.HOME));
		add(home);
		
		
		date.setBackground(new Color(203, 229, 88));
		date.setIcon(new ImageIcon("images/dates.png"));
		date.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		date.setForeground(Color.WHITE);
		date.setFocusable(false);
		date.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.DATE));
		add(date);
		
		reports.setBackground(new Color(203, 229, 88));
		reports.setIcon(new ImageIcon("images/reports.png"));
		reports.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		reports.setForeground(Color.WHITE);
		reports.setFocusable(false);
		reports.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.REPORTS));
		add(reports);
		
//		signin.setBackground(new Color(203, 229, 88));
//		signin.setIcon(new ImageIcon("images/regist.png"));
//		signin.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
//		signin.setForeground(Color.WHITE);
//		signin.setFocusable(false);
//		signin.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.SIGN_UP));
//		add(signin);
//		
//		login.setBackground(new Color(203, 229, 88));
//		login.setIcon(new ImageIcon("images/user.png"));
//		login.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
//		login.setForeground(Color.WHITE);
//		login.setFocusable(false);
//		login.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.LOGIN));
//		add(login);
	}
	
	public void changeLanguage() {
		home.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.HOME));
		date.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.DATE));
		reports.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.REPORTS));
//		signin.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.SIGN_UP));
//		login.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.LOGIN));
	}

}
