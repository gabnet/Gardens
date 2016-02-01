package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.Main;

public class CellListener implements ActionListener {

	private Main gui;
	
	public CellListener(Main gui){
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {

		String command = event.getActionCommand();

		switch (command) {
			case "cellChanged" : {
				this.gui.updatesCells(((CellChanged)event).getRow(), ((CellChanged)event).getCol());
			}
		}
	}

}
