package viewTest;

import javax.swing.JPanel;

import constants.ConstantsView;

public class PanelFooter extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ContactFooter contactFooter;
	public JPanel line;

	public PanelFooter() {
		setBackground(ConstantsView.GREEN_FOOTER);
		init();
	}
	
	public void init() {
		contactFooter = new ContactFooter();
		line = new JPanel();
		config();
	}
	
	public void config() {
		line.setBackground(ConstantsView.ORANGE);
		add(contactFooter);
		
	}
	
	public void changeLanguage() {
		contactFooter.changeLanguage();
	}

}
