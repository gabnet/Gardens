package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.Main;

public class CellActionListener implements ActionListener {

	private Main gui;
	
	public CellActionListener(Main gui){
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {

		String command = event.getActionCommand();
		
		switch (command) {
			case "cellChanged" : {
				this.gui.updatesCell(((CellChangedEvent)event).getRow(), ((CellChangedEvent)event).getCol(), ((CellChangedEvent)event).getSymbol());
			}
		}
	}

}
