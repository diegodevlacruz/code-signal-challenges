package com.diegodelacruz.codesignal.concurrency.syncblock;

public class SynchronizedBlockCounter {

    private int count = 0;

    // TODO: Change this synchronized method to use a synchronized block instead
    public synchronized void increment() {
        synchronized (this) {
            count++;
        }
    }

    public synchronized int getCount() {
        return count;
    }
}
