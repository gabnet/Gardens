package logic.cycle;

import gui.listeners.CycleChanged;
import gui.listeners.CycleListener;
import logic.ListenerContainer;

public class Cycle extends Thread {

	private Control control;
	private int numberOfCycles;
	private ListenerContainer guiListener;
	
	public Cycle(Control control) {
		this.control = control;
		numberOfCycles = 0;
	}
	
	public void setListener(CycleListener guiListener) {
		this.guiListener = new ListenerContainer(guiListener);	
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
		guiListener.actionPerformed(new CycleChanged(this, 0, "cyclesChanged", numberOfCycles));
	}
}
