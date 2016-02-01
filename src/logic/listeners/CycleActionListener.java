package logic.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.Main;

public class CycleActionListener implements ActionListener {

	private Main gui;
	
	public CycleActionListener(Main gui){
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {

		String command = event.getActionCommand();

		switch (command) {
			case "cyclesChanged": {
				this.gui.updateCycles(((CycleChangedActionEvent)event).getCycles());
				break;
			}
		}
	}
}