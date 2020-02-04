package viewTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelTable extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	private DefaultTableModel dtmElements; 
	private JTable jtElements;
	private JScrollPane jsTable;
	
	public PanelTable() {
		setBorder(BorderFactory.createEmptyBorder(200, 0, 0,0));
		initComponents();
	}
	
	private void initComponents(){
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setFocusable(false);
		
		String[] headers = {"Nombre", "Tipo Alimento", "Precio(Kg)", "Cultivo"};
		dtmElements = new DefaultTableModel();
		dtmElements.setColumnIdentifiers( headers );

		Font fontHeader = new Font("Bauhaus 93", Font.PLAIN, 17);

		jtElements = new JTable();
		jtElements.setModel(dtmElements);
		jtElements.getTableHeader().setReorderingAllowed(false);
		jtElements.getTableHeader().setBackground(Color.WHITE);
		jtElements.getTableHeader().setForeground(Color.BLACK);
		jtElements.getTableHeader().setFont(fontHeader);
		jtElements.setBackground(Color.WHITE);
		jtElements.setFillsViewportHeight(true);
		jtElements.setBorder(null);
		jtElements.setEnabled(false);

		jsTable = new JScrollPane(jtElements);
		jsTable.setForeground(Color.BLACK);
		jsTable.setBorder(null);
		jsTable.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.add(jsTable, BorderLayout.PAGE_END);
		this.setBorder(null);
		
	}

	public void addElementToTable(Object[] vector){
		dtmElements.addRow(vector);
	}

}
