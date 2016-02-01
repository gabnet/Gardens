package logic;

import java.awt.event.ActionEvent;

public class ListenerContainer {

	private gui.listeners.CycleListener listener;
	
	public ListenerContainer(gui.listeners.CycleListener listener){
		this.listener = listener;
	}
	
	public void actionPerformed(ActionEvent event) {
		if (listener != null)
			listener.actionPerformed(event);
	}
}
