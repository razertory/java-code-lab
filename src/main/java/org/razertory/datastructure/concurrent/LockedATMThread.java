package org.razertory.datastructure.concurrent;

/**
 * LockedATM线程
 * @author razertory
 * @see LockedATM
 */
public class LockedATMThread extends Thread{
	private LockedATM atm;
	
	public LockedATMThread(LockedATM atm){
		this.atm = atm;
	}
	
	public void run(){
		atm.deposit(200);
		atm.withDraw(700);
		atm.deposit(500);
		atm.withDraw(600);
	}

}
