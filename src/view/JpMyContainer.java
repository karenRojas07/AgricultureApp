package view;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import constants.ConstantsView;

public class JpMyContainer extends JPanel {

	
	private static final long serialVersionUID = 1L;
	private JPanelMenu menu;
	private JPanelImageHead headImage;
	
	public JpMyContainer() {
		this.setLayout( new BoxLayout( this, BoxLayout.Y_AXIS ));
		this.setBackground(ConstantsView.GREEN);
		initComponents();
		this.setVisible(true);
	}
	
	private void initComponents() {
		menu = new JPanelMenu();
		this.add(menu);
		
		headImage = new JPanelImageHead();
		this.add(headImage);
	}
}
