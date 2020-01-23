package view;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import constants.ConstantsView;

public class MyFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private JpMyContainer myPanel;
	private JMyMenu jbarMenu;
		
	public MyFrame() {
		this.setExtendedState( MAXIMIZED_BOTH );
		this.setLayout( new BorderLayout() );
		this.getContentPane().setBackground(ConstantsView.GREEN);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setBackground(ConstantsView.GREEN);
		initComponents();
		this.setIconImage (new ImageIcon(getClass().getResource(constants.ConstantsView.LOGO_IMAGE)).getImage());
		this.setVisible(true);
	}

	private void initComponents() {
		jbarMenu = new JMyMenu();
		this.setJMenuBar(jbarMenu);
		
		myPanel = new JpMyContainer();
		myPanel.setOpaque(true);
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(myPanel);
		this.add(jScrollPane, BorderLayout.CENTER);
	}
}
