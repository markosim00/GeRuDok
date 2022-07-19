package models;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.event.EventListenerList;

import event.UpdateEvent;
import event.UpdateListener;
import model.elements.DocumentDevice;

public class PageModel {

	private static int count = 0;
	private String name;
	
	protected ArrayList<DocumentDevice> documentElements = new ArrayList<DocumentDevice>();
	
	EventListenerList listenerList = new EventListenerList();
	UpdateEvent updateEvent = null;
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		PageModel.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getElementCount() {
		return documentElements.size();
	}
	@Override
	public String toString() {
		return name;
	}
	
	public Iterator<DocumentDevice> getDeviceIterator(){
		return documentElements.iterator();
	}
	
	public void addDocumentElements(DocumentDevice device) {
		
		documentElements.add(device);
		fireUpdatePerformed();
	
	}
	
	public void addUpdateListener(UpdateListener l) {
		listenerList.add(UpdateListener.class, l);
	}
	
	public void removeUpdateListener(UpdateListener l) {
		listenerList.remove(UpdateListener.class, l);
	}
	
	
	protected void fireUpdatePerformed() {
		
		Object[] listeners = listenerList.getListenerList();
		
		for(int i = listeners.length - 1; i >= 0; i--) {
			
			if(listeners[i] == UpdateListener.class) {
				
				if(updateEvent == null) {
					updateEvent = new UpdateEvent(this);
					((UpdateListener)listeners[i+1]).updatePerformed(updateEvent);
				}
				
				
			}
			
			
		}
		
		
	}
	
	
	
}
