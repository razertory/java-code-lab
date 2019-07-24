package org.razertory.javacodelab.concurrency.printinorder;

import java.util.concurrent.Semaphore;

public class Solution2 {
    Solution2() {}

    private Semaphore semaphore1 = new Semaphore(0);

    private Semaphore semaphore2 = new Semaphore(0);

    private boolean firstDone = false;
    private boolean secondDone = false;

    public void first(Runnable printFirst) throws InterruptedException {

        synchronized (this){
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            firstDone = true;
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        semaphore2.acquire();
        printThird.run();
    }
}
