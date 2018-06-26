package org.razertory.datastructure.concurrent;

/**
 * 
 * @author razertory
 */
public class ChopStickUnLocked extends ChopStickLocked {
	public ChopStickUnLocked(){
		super();
	}
	
	public boolean pickUp(){
		return lock.tryLock();
	}

}
