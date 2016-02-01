package gui;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class GuiFactory {
	
	public static JTable getTable(){
		
		JTable table = new JTable();
		
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,	null, null, null }, },
				new String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" }));
		
		table.setCellSelectionEnabled(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
	    	    
	    return table;
	}
}