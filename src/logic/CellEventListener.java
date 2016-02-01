package logic;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import logic.elements.Garden;

public class CellEventListener implements ListSelectionListener {
	
	private Garden garden;
	private JTable table;
	
	public CellEventListener(Garden garden, JTable table){
		this.garden = garden;
		this.table = table;
	}
	
	public void valueChanged(ListSelectionEvent event) {
		if (!event.getValueIsAdjusting())
			garden.pressCell(table.getSelectedRow(), table.getSelectedColumn());
	}
}