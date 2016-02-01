package gui.listeners;

import java.awt.event.ActionEvent;

public class CellChangedEvent extends ActionEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int row;
	private int col;
	private String symbol;
	
	public CellChangedEvent(Object source, int id, String command, int row, int col, String symbol) {
		super(source, id, command);
		
		this.row = row;
		this.col = col;
		this.symbol = symbol;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public String getSymbol() {
		return symbol;
	}
}
