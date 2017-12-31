package org.razertory.datastructure.thread;

/**
 * RunExtendThread
 * @author razertory
 * @see ExtendThread
 */
public class ExtendThreadRun {
	
	public static void main(String args[]){
		ExtendThread instance = new ExtendThread();
		instance.start();
		
		while(instance.count != 5){
			try{
				Thread.sleep(250);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
