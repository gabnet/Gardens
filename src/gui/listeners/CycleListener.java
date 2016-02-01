package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.Main;

public class CycleListener implements ActionListener {

	private Main gui;
	
	public CycleListener(Main gui){
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {

		String command = event.getActionCommand();

		switch (command) {
			case "cyclesChanged": {
				this.gui.updateCycles(((CycleChanged)event).getCycles());
				break;
			}
			case "cellsChanged" : {
				this.gui.updatesCells(((CellChanged)event).getRow(), ((CellChanged)event).getCol());
			}
		}
	}
}