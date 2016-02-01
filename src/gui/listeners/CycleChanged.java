package gui.listeners;

import java.awt.event.ActionEvent;

public class CycleChanged extends ActionEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cyclesNumber;
	
	public CycleChanged(Object source, int id, String command, int cyclesNumber) {
		super(source, id, command);
		
		this.cyclesNumber = cyclesNumber;
	}
	
	public int getCycles(){
		return cyclesNumber;
	}
}
