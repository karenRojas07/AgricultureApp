package viewTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import constants.ConstantsLanguage;
import controller.Command;
import general.HandlerLanguage;

public class PanelNorth extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton logo;
	public JButton spanish;
	public JButton english;
	public JPanel panelLogo;

	public PanelNorth(ActionListener acl) {
		setBackground(Color.WHITE);
		init(acl);
	}
	
	public void init(ActionListener acl) {
		logo = new JButton();
		spanish = new JButton();
		english = new JButton();
		panelLogo = new JPanel();
		config(acl);
	}
	
	public void config(ActionListener acl) {
		panelLogo.setLayout(new BorderLayout());
		panelLogo.setBackground(Color.WHITE);
		panelLogo.setBorder(BorderFactory.createEmptyBorder(20, 5, 20, 400));
		
		logo.setIcon(new ImageIcon("images/banner.png"));
		logo.setBackground(Color.white);
		logo.setBorderPainted(false);
		logo.setFocusable(false);
		panelLogo.add(logo, BorderLayout.WEST);
		add(panelLogo);
		
		spanish.setBackground(new Color(255, 203, 124));
		spanish.setForeground(Color.WHITE);
		spanish.setBorderPainted(false);
		spanish.setFocusable(false);
		spanish.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.LANG_ES));
		spanish.setActionCommand(Command.LANGUAGE_ES.name());
		spanish.addActionListener(acl);
		add(spanish);
		
		
		english.setBackground(new Color(255, 203, 124));
		english.setForeground(Color.WHITE);
		english.setBorderPainted(false);
		english.setFocusable(false);
		english.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.LANG_US));
		english.addActionListener(acl);
		english.setActionCommand(Command.LANGUAGE_ENG.name());
		add(english);
	}
	
	public void changeLanguge() {
		spanish.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.LANG_ES));
		english.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.LANG_US));
	}
}
