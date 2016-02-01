package logic.cycle;

import gui.listeners.CycleChanged;
import gui.listeners.CycleListener;

public class Cycle extends Thread {

	private Control control;
	private int numberOfCycles;
	private CycleListener guiListener;
	
	public Cycle(Control control) {
		this.control = control;
		numberOfCycles = 0;
	}
	
	public void setListener(CycleListener guiListener) {
		this.guiListener = guiListener;	
	}
	
	@Override
	public void run() {
	
		control.start();
		
		do {
			try {
				Thread.sleep(1000);
				setCycles(numberOfCycles + 1);
			} catch (InterruptedException e) {
				e.printStackTrace();
				control.stop();
			}
		} while (control.isRunning());
	}
	
	public void halt(){
		control.stop();
	}

	public int getCycles() {
		return numberOfCycles;
	}
	
	private void setCycles(int c){
		numberOfCycles = c;
		if (guiListener != null)
			guiListener.actionPerformed(new CycleChanged(this, 0, "cyclesChanged", numberOfCycles));
	}
}
