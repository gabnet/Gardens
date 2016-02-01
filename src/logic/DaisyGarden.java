package logic;

import java.awt.EventQueue;

import javax.swing.JTable;

import gui.GuiFactory;
import logic.cycle.Control;
import logic.cycle.Cycle;
import logic.elements.Garden;

public class DaisyGarden {

	private static logic.listeners.CycleActionListener cycleActionListener;
	private static gui.listeners.CellActionListener cellActionListener;
	private static gui.listeners.ButtonActionListener buttonActionListener;
	private static logic.CellEventListener cellEventListener;
	private static JTable mainTable;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Garden garden = new Garden();
					
					logic.cycle.Cycle logic = new Cycle(new Control());
					gui.Main window = new gui.Main();
					
					mainTable = GuiFactory.getTable();
					
					cellEventListener = new logic.CellEventListener(garden, mainTable);
					cycleActionListener = new logic.listeners.CycleActionListener(window);
					buttonActionListener = new gui.listeners.ButtonActionListener(logic);
					cellActionListener = new gui.listeners.CellActionListener(window);
					
					logic.setListener(cycleActionListener);
					window.setListener(buttonActionListener, cellEventListener);
					garden.setListener(cellActionListener);
					
					window.Start(mainTable);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
