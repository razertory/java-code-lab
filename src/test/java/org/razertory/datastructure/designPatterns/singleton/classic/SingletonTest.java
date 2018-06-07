package org.razertory.datastructure.designPatterns.singleton.classic;

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

    /**
     * 非线程安全的单例模式，并发只执行获取对象方法的时候，可能会出现不同的对象（观察hashcode的值）。
     * 原理参考：
     * http://www.hollischuang.com/archives/1860
     * http://www.hollischuang.com/archives/199
     */
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