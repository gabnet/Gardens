package logic.elements;

import gui.listeners.CellChanged;
import gui.listeners.CellListener;

public class Garden {

	private CellListener guiListener;
	private int[][] grid;
	
	private final int rows = 20;
	private final int cols = 20;
	
	public Garden(){
		grid = new int[20][20];
		initGarden();
	}
	
	public void setListener(CellListener guiListener) {
		this.guiListener = guiListener;	
	}

	public void pressCell(int selectedRow, int selectedColumn) {
		
		if (grid[selectedRow][selectedColumn] == 0)
			grid[selectedRow][selectedColumn] = 1;
		else
			grid[selectedRow][selectedColumn] = 0;
		
		if (guiListener != null)
			guiListener.actionPerformed(new CellChanged(this, 0, "cellChanged", selectedRow, selectedColumn));
	}
	
	private void initGarden(){
		for (int r = 0; r < rows; r++)
			for (int c = 0; c < cols; c++)
				grid[r][c] = 0;
	}
}
