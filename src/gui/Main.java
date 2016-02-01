package gui;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import java.awt.BorderLayout;

import javax.swing.table.DefaultTableModel;

import logic.CellEventListener;
import logic.LogicActionListener;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;

import javax.swing.JLabel;

public class Main {



	private LogicActionListener logicActionListener;
	private CellEventListener cellEventListener;
	
	// gui components
	private JFrame frmGardem;
	private JTable table;

	private JLabel lblCycles;
	
	public void setListener(LogicActionListener logicActionListener, CellEventListener cellEventListener){
		this.logicActionListener = logicActionListener;
		this.cellEventListener = cellEventListener;
	}
	
	/**
	 * Create the application.
	 * @return 
	 * @wbp.parser.entryPoint
	 */
	public void Start(JTable tTable) {
		initialize(tTable);
		frmGardem.setVisible(true);
	}

	public void updateCycles(int cyclesNumber) {
		lblCycles.setText(Integer.toString(cyclesNumber));
	}
	
	public void updatesCells(int row, int col) {
		table.setValueAt("@", row, col);
	}
	
	public JTable getTable(){
		return table;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(JTable tTable) {
		frmGardem = new JFrame();
		frmGardem.setTitle("Garden");
		frmGardem.setBounds(100, 100, 768, 552);
		frmGardem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmGardem.setJMenuBar(menuBar);
		
		JMenu mnCycles = new JMenu("Cycles");
		menuBar.add(mnCycles);
		
		JMenuItem mntmStart = new JMenuItem("Start");
		mnCycles.add(mntmStart);
		mntmStart.addActionListener(logicActionListener);
		
		JMenuItem mntmStop = new JMenuItem("Stop");
		mnCycles.add(mntmStop);
		frmGardem.getContentPane().setLayout(null);
		mntmStop.addActionListener(logicActionListener);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 752, 493);
		frmGardem.getContentPane().add(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		table = tTable;
	    mainPanel.add(table, BorderLayout.NORTH);
		ListSelectionModel cellSelectionModel = table.getSelectionModel();
	    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    cellSelectionModel.addListSelectionListener(cellEventListener);
	    
		JPanel controlPanel = new JPanel();
		mainPanel.add(controlPanel, BorderLayout.SOUTH);
		
		JLabel lblCycle = new JLabel("Cycle: ");
		controlPanel.add(lblCycle);
		
		lblCycles = new JLabel("0");
		controlPanel.add(lblCycles);
	}
}