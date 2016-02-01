package logic;

import java.awt.EventQueue;

import javax.swing.JTable;

import gui.GuiFactory;
import logic.cycle.Control;
import logic.cycle.Cycle;
import logic.elements.Garden;

public class DaisyGarden {

	private static logic.listeners.CycleActionListener guiCycleActionListener;
	private static gui.listeners.CellActionListener guiCellActionListener;
	private static gui.listeners.ButtonActionListener logicActionListener;
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
					guiCycleActionListener = new logic.listeners.CycleActionListener(window);
					logicActionListener = new gui.listeners.ButtonActionListener(logic);
					guiCellActionListener = new gui.listeners.CellActionListener(window);
					
					logic.setListener(guiCycleActionListener);
					window.setListener(logicActionListener, cellEventListener);
					garden.setListener(guiCellActionListener);
					
					window.Start(mainTable);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
