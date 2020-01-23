package viewTest;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelNorth extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton logo;

	public PanelNorth() {
		
	}
	
	public void init() {
		logo = new JButton();
		logo.setText("Aqui Va El Logo");
	}
	
}
