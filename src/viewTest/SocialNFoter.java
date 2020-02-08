package viewTest;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SocialNFoter extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel networks;
	public JLabel facebook;
	public JLabel linkedIn;
	public JLabel twitter;
	public JLabel git;

	public SocialNFoter() {
		init();
	}
	
	public void init() {
		networks = new JLabel();
		facebook = new JLabel();
		linkedIn = new JLabel();
		twitter = new JLabel();
		git = new JLabel();
		config();
	}
	
	public void config() {
		
	}
	
	

}
