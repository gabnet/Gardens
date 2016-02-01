package logic.elements;

import gui.listeners.CellChangedEvent;
import gui.listeners.CellActionListener;

public class Garden {

	private CellActionListener guiListener;
	private int[][] grid;
	
	private final int rows = 20;
	private final int cols = 20;
	
	public Garden(){
		grid = new int[20][20];
		initGarden();
	}
	
	public void setListener(CellActionListener guiListener) {
		this.guiListener = guiListener;	
	}

	public void pressCell(int selectedRow, int selectedColumn) {

		String s = new String();
		
		if (grid[selectedRow][selectedColumn] == 0) {
			s = "@";
			grid[selectedRow][selectedColumn] = 1;
		}
		else
			grid[selectedRow][selectedColumn] = 0;
		
		if (guiListener != null)
			guiListener.actionPerformed(new CellChangedEvent(this, 0, "cellChanged", selectedRow, selectedColumn, s));
		
	}
	
	private void initGarden(){
		for (int r = 0; r < rows; r++)
			for (int c = 0; c < cols; c++)
				grid[r][c] = 0;
	}
}
