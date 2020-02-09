package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import constants.ConstantsLanguage;
import constants.ConstantsView;
import general.HandlerLanguage;

public class PanelAdmData extends JPanel{

	private static final long serialVersionUID = 1L;
	public ConfigButton addCrop;
	public ConfigButton editCrop;
	public ConfigButton delCrop;
	private GridBagLayout gbl;
	private GridBagConstraints gbc;

	public PanelAdmData() {
		setBackground(Color.WHITE);
		init();
		setLayout(gbl);
		setBorder(BorderFactory.createEmptyBorder(40, 450, 40, 450));
		config();
	}
	
	public void init() {
		addCrop = new ConfigButton();
		editCrop = new ConfigButton();
		delCrop = new ConfigButton();
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
	}
	
	public void config() {
		addCrop.buttonTextIcon(ConstantsView.ADD, ConstantsLanguage.ADD_CROP, Color.WHITE, true, ConstantsView.BAUHAUS_17, Color.GRAY);
		addCrop.setBorder(new RoundBorder(10));
		delCrop.buttonTextIcon(ConstantsView.DELETE, ConstantsLanguage.DEL_CROP, Color.WHITE, true, ConstantsView.BAUHAUS_17, Color.GRAY);
		delCrop.setBorder(new RoundBorder(10));
		editCrop.buttonTextIcon(ConstantsView.MODIFY, ConstantsLanguage.EDIT_CROP, Color.WHITE, true, ConstantsView.BAUHAUS_17, Color.GRAY);
		editCrop.setBorder(new RoundBorder(10));
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5, 5, 5, 5);
		add(addCrop, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(delCrop, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(editCrop, gbc);
	}
	
	public void changeLanguage() {
		addCrop.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.ADD_CROP));
		delCrop.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.DEL_CROP));
		editCrop.setText(HandlerLanguage.languageProperties.getProperty(ConstantsLanguage.EDIT_CROP));
	}

}
