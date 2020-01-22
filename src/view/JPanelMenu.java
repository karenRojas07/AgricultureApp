package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import constants.ConstantsView;

public class JPanelMenu extends JPanel{

	private static final long serialVersionUID = 1L;
	private JBtnImage bntHome;
	private JTextField lblSearch;
	private JBtnImage btnSearch;

	public JPanelMenu() {
		this.setLayout(new GridLayout(1,2));
		initComponents();
		this.setPreferredSize(new Dimension(200,100));
		this.setBackground(ConstantsView.GREEN);
		this.setVisible(true);
	}

	private void initComponents() {
		bntHome = new JBtnImage(ConstantsView.HOME_IMAGE, ConstantsView.HOME_TXT, true, true, Color.WHITE);
		bntHome.setPreferredSize(new Dimension(45, 45));
		bntHome.setBorder(BorderFactory.createEmptyBorder(0, 0, 100, 0));
		this.add(bntHome);

		JPanel panelContainer = new JPanel();
		panelContainer.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 300));
		panelContainer.setBackground(ConstantsView.GREEN);
		
		lblSearch = new JTextField("ingrese su busqueda");
		lblSearch.setFont(ConstantsView.RUBIK_18);
		
		lblSearch.setPreferredSize(new Dimension(300, 45));
		btnSearch = new JBtnImage(ConstantsView.SEARCH_IMAGE);
		btnSearch.setBorder(null);
		panelContainer.add(lblSearch);
		panelContainer.add(btnSearch);
		this.add(panelContainer);
	}
}
