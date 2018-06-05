package org.razertory.datastructure.thread.lockcondition;

import org.razertory.datastructure.thread.Bank;
import org.razertory.datastructure.thread.TransferRunnable;

public class SyncBanTest {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public void test() {
        Bank b = new Bank(NACCOUNTS, INITIAL_BALANCE);
        int i;
        for (i = 0; i < NACCOUNTS; i++)
        {
            TransferRunnable r = new TransferRunnable(b, i, INITIAL_BALANCE);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
