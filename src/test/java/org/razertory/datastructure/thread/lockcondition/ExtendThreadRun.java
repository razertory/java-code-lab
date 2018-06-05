package org.razertory.datastructure.thread.lockcondition;

import org.junit.Test;
import org.razertory.datastructure.thread.ExtendThread;


public class ExtendThreadRun {

    @Test
    public void test() {
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
