package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JBtnImage extends JButton{

	private static final long serialVersionUID = 1L;

	public JBtnImage(String urlImage,String nameButton,boolean styleTxt,boolean tipeStyle,Color color) {
		this.setText(nameButton);
		this.setOpaque(false);
		this.setBorder(null);
		this.setFocusable(false);
		this.setBorderPainted(false);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setBackground(color);
		this.setIcon(new ImageIcon(getClass().getResource(urlImage)));
		if (styleTxt==true) {
			this.setVerticalTextPosition(SwingConstants.BOTTOM);
			this.setHorizontalTextPosition(SwingConstants.CENTER);
			this.setPreferredSize(new Dimension(45	,45));
		}if (tipeStyle=false) {
			this.setBackground(color);
		}
	}

	public JBtnImage(String urlImage) {
		setIcon(new ImageIcon(getClass().getResource(urlImage)));
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setOpaque(false);
		this.setBorderPainted(false);
	}
}