package view;

import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import constants.ConstantsView;

public class JMyMenu extends JMenuBar{

	private static final long serialVersionUID = 1L;
	private JMenu jmIdioma;
	private JMenuItem jmiEspañol;
	private JMenuItem jmiIngles;
	

	public JMyMenu() {
		initComponents();
	}

	private void initComponents() {
		jmIdioma = new JMenu(ConstantsView.LENGUAJE_TXT);
		jmIdioma.setBackground(Color.WHITE);
		
		jmiIngles = new JMenuItem(ConstantsView.ENGLISH_TXT);
		jmiIngles.setBackground(Color.WHITE);
		jmIdioma.add(jmiIngles);
		
		jmiEspañol = new JMenuItem(ConstantsView.SPANISH_TXT);
		jmiEspañol.setBackground(Color.WHITE);
		jmIdioma.add(jmiEspañol);
		
		this.add(jmIdioma);
	}
}