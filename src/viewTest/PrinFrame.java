package viewTest;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class PrinFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelPrin panel;
	private JScrollPane scroll;
	
	public PrinFrame() {
		setIconImage(new ImageIcon("images/logoP.png").getImage());
		setTitle("AGRICAPP");
		setExtendedState(MAXIMIZED_BOTH);
		init();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void init() {
		panel = new PanelPrin();
		scroll = new JScrollPane(panel);
		add(scroll);
	}

}
