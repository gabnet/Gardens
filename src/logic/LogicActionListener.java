package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.cycle.Cycle;

public class LogicActionListener implements ActionListener {

	private Cycle cycle;
	
	public LogicActionListener(Cycle cycle) {
		this.cycle = cycle;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {

		String command = event.getActionCommand();

		switch (command) {
			case "Start": {
				new Thread(cycle).start();
				break;
			}
			case "Stop": {
				cycle.halt();
			}
		}
	}
}
