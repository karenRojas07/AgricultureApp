package viewTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
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
	private JPanel aux;
	private PanelFooter panelF;
	
	public PanelPrin(ActionListener acl) {
		setLayout(new BorderLayout());
		init(acl);
	}
	
	public void init(ActionListener acl) {
		panelNorth = new JPanel();
		panelL = new PanelNorth(acl);
		menu = new MenuBar(acl);
		table = new PanelTable();
		aux = new JPanel();
		panelF = new PanelFooter();
		config();
	}
	
	private void config() {
		panelNorth.setLayout(new BorderLayout());
		panelNorth.setBackground(Color.white);
		panelNorth.add(panelL, BorderLayout.NORTH);
		panelNorth.add(menu, BorderLayout.CENTER);
		add(panelF, BorderLayout.SOUTH);
		add(panelNorth, BorderLayout.NORTH);
		add(aux, BorderLayout.CENTER);
	}
	
	public void changePanelT() {
		this.remove(aux);
		aux = table;
		add(aux, BorderLayout.CENTER);
		this.repaint();
	}
	
	public void addElementToTable(Object [] obj) {
		table.addElementToTable(obj);
	}
	
	public void changeLanguage() {
		panelL.changeLanguge();
		menu.changeLanguage();
		table.changeLanguage();
		panelF.changeLanguage();
	}

}
