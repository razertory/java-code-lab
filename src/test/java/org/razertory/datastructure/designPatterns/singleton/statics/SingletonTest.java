package org.razertory.datastructure.designPatterns.singleton.statics;

import org.junit.Assert;
import org.junit.Test;


public class SingletonTest {

    @Test
    public void getInstance() throws Exception {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        Assert.assertTrue(a == b);
        Assert.assertTrue(a.hashCode() == b.hashCode());
    }

    @Test
    public void concurrentGetInstance() throws Exception {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(
                    () -> System.out.println(Singleton.getInstance().hashCode())
            );
        }
        for(Thread thread: threads) {
            thread.start();
        }
    }

}