package viewTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PanelPrin extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelNorth panelL;
	private MenuBar menu;
	private PanelTable table;
	private JPanel panelNorth;
	
	public PanelPrin(ActionListener acl) {
		setLayout(new BorderLayout());
		init(acl);
	}
	
	public void init(ActionListener acl) {
		panelNorth = new JPanel();
		panelL = new PanelNorth(acl);
		menu = new MenuBar();
		table = new PanelTable();
		config();
	}
	
	private void config() {
		panelNorth.setLayout(new BorderLayout());
		panelNorth.setBackground(Color.white);
		
		panelNorth.add(panelL, BorderLayout.NORTH);
		panelNorth.add(menu, BorderLayout.CENTER);
		add(panelNorth, BorderLayout.NORTH);
		add(table, BorderLayout.CENTER);
	}
	
	public void changeLanguage() {
		panelL.changeLanguge();
		menu.changeLanguage();
		table.changeLanguage();
	}

}
