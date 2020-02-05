package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

import org.json.simple.DeserializationException;

import general.HandlerLanguage;
import models.CropManager;
import models.CropTransitory;
import persistence.Manager;
import viewTest.PrinFrame;

public class AppManager implements ActionListener{
	
	private static final String NAME_FILE_CONFIG = "config.init";
	private HandlerLanguage config = null;
	private String languageDefault;
	public PrinFrame frame;
	public CropManager cropM;
	public Manager fileM;
	
	public AppManager() throws DeserializationException, IOException {
		loadConfiguration();
		cropM = new CropManager();
		fileM = new Manager();
		frame = new PrinFrame(this);
		addElementsToTable();
	}
	
	public void addElementsToTable() {
		for (int i = 0; i < cropM.getListCropTr().size(); i++) {
			CropTransitory crop = cropM.getListCropTr().get(i);
			frame.addElementToTable(crop.toObjectVector());
		}
	}
	
	public String getLanguageDefault(){
		languageDefault = Locale.getDefault().getLanguage();
		switch (languageDefault) {
		case "es":
			return "Spanish";
		case "us":
			return "English";
		}
		return "Spanish";
	}

	public void loadLanguage() throws IOException{
		try {
			config.loadLanguage();
		} catch (Exception e) {			
		}
	}

	public void saveConfig() throws IOException{
		try {
			new HandlerLanguage(NAME_FILE_CONFIG).saveLanguage();
		} catch (Exception e) {
		}
	}

	public void changeToEnglish() throws IOException{
		HandlerLanguage.language = "language/languageUS.properties";
		saveConfig();
		loadLanguage();		
	}

	public void changeToSpanish() throws IOException{
		HandlerLanguage.language = "language/languageES.properties";
		saveConfig();
		loadLanguage();
	}
	
	public void loadConfiguration(){
		if(config == null){
			config = new HandlerLanguage(NAME_FILE_CONFIG);
		}
		try{
			config.loadLanguage();
		}catch(IOException e){
			System.err.println("file not found : NAME_FILE_CONFIG");
		}
	}
	
	private void manageChangeLanguageUS(){
		try {
			changeToEnglish();
		} catch (IOException e1) {
			e1.printStackTrace();
		}			
		manageChangeLanguage();
		
	}
	
	private void manageChangeLanguageES(){
		try {
			changeToSpanish();
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
		manageChangeLanguage();	
	}
	
	private void manageChangeLanguage(){
		frame.changeLanguage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (Command.valueOf(e.getActionCommand())) {
		case LANGUAGE_ES:
			manageChangeLanguageES();
			break;
		case LANGUAGE_ENG:
			manageChangeLanguageUS();
			break;
		default:
			break;
		}
	}

}
