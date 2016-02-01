package logic.elements;

public class Garden {

	private int[][] grid;
	
	private final int rows = 20;
	private final int cols = 20;
	
	public Garden(){
		grid = new int[20][20];
		initGarden();
	}

	public void pressCell(int selectedRow, int selectedColumn) {
		
		if (grid[selectedRow][selectedColumn] == 0)
			grid[selectedRow][selectedColumn] = 1;
		else
			grid[selectedRow][selectedColumn] = 0;
	}
	
	private void initGarden(){
		for (int r = 0; r < rows; r++)
			for (int c = 0; c < cols; c++)
				grid[r][c] = 0;
	}
}
