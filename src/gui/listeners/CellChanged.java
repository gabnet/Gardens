package gui.listeners;

import java.awt.event.ActionEvent;

public class CellChanged extends ActionEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int row;
	private int col;
	
	public CellChanged(Object source, int id, String command, int row, int col) {
		super(source, id, command);
		
		this.row = row;
		this.col = col;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol(){
		return col;
	}
}
