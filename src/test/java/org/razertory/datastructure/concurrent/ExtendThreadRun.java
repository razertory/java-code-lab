package org.razertory.datastructure.concurrent;

import org.junit.Test;
import org.razertory.datastructure.concurrent.ExtendThread;


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
