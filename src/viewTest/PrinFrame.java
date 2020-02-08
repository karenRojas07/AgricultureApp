package viewTest;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import constants.ConstantsLanguage;
import general.HandlerLanguage;

public class PrinFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelPrin panel;
	private JScrollPane scroll;
	
	public PrinFrame(ActionListener acl) {
		setIconImage(new ImageIcon("images/logoP.png").getImage());
		setTitle(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.APP_NAME));
		setExtendedState(MAXIMIZED_BOTH);
		init(acl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void init(ActionListener acl) {
		panel = new PanelPrin(acl);
		scroll = new JScrollPane(panel);
		add(scroll);
	}
	
	public void changePanelT() {
		panel.changePanelT();
		this.pack();
		setSize(1600, 1400);
		
	}

	public void changeLanguage() {
		setTitle(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.APP_NAME));
		panel.changeLanguage();
	}
	
	public void addElementToTable(Object [] obj) {
		panel.addElementToTable(obj);
	}
}
