package com.diegodelacruz.codesignal.concurrency.syncblock;

public class ThreadSafeCounter {

    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }

}
