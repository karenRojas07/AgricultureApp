package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import constants.ConstantsView;

public class JPanelImageHead extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel lblImage;

	public JPanelImageHead() {
		initComponents();
		this.setVisible(true);
		this.setBackground(ConstantsView.GREEN);
	}
	private void initComponents() {
		lblImage = new JLabel();
		lblImage.setIcon(new ImageIcon(getClass().getResource(ConstantsView.HEAD_IMAGE)));
		this.add(lblImage);
	}	
}
