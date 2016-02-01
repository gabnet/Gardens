package logic.cycle;

public class Control {
	
	private volatile boolean run;
	
	public Control(){
		run = false;
	}
	
	public void start(){
		run = true;
	}
	
	public void stop(){
		run = false;
	}
	
	public boolean isRunning(){
		return run;
	}
}
