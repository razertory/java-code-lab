package org.razertory.datastructure.concurrent;

import org.razertory.datastructure.concurrent.Bank;
import org.razertory.datastructure.concurrent.TransferRunnable;

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
