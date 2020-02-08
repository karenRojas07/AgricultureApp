package viewTest;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import constants.ConstantsLanguage;
import controller.Command;
import general.HandlerLanguage;

public class MenuBar extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton home;
//	public JButton signin;
//	public JButton login;
	public JButton data;
	public JButton reports;
	public JButton gestDates;
	
	public MenuBar(ActionListener acl) {
		setBackground(new Color(203, 229, 88));
		init(acl);
	}
	
	public void init(ActionListener acl) {
		home = new JButton();
		data = new JButton();
		reports = new JButton();
		gestDates = new JButton();
//		signin = new JButton();
//		login = new JButton();
		config(acl);
	}
	
	public void config(ActionListener acl) {
		home.setBackground(new Color(203, 229, 88));
		home.setIcon(new ImageIcon("images/home.png"));
		home.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		home.setForeground(Color.WHITE);
		home.setFocusable(false);
		home.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.HOME));
		add(home);
		
		
		data.setBackground(new Color(203, 229, 88));
		data.setIcon(new ImageIcon("images/data.png"));
		data.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		data.setForeground(Color.WHITE);
		data.setFocusable(false);
		data.addActionListener(acl);
		data.setActionCommand(Command.DATES.name());
		data.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.DATA));
		add(data);
		
		reports.setBackground(new Color(203, 229, 88));
		reports.setIcon(new ImageIcon("images/reports.png"));
		reports.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		reports.setForeground(Color.WHITE);
		reports.setFocusable(false);
		reports.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.REPORTS));
		add(reports);
		
		
		gestDates.setBackground(new Color(203, 229, 88));
		gestDates.setIcon(new ImageIcon("images/edit.png"));
		gestDates.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		gestDates.setForeground(Color.WHITE);
		gestDates.setFocusable(false);
		gestDates.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.GEST_DT));
		add(gestDates);
		
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
		data.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.DATA));
		reports.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.REPORTS));
		gestDates.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.GEST_DT));
//		signin.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.SIGN_UP));
//		login.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.LOGIN));
	}

}
