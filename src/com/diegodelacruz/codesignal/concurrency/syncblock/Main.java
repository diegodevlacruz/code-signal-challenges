package com.diegodelacruz.codesignal.concurrency.syncblock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //ThreadSafeCounter threadSafeCounter = new ThreadSafeCounter();
        SynchronizedBlockCounter synchronizedBlockCounter = new SynchronizedBlockCounter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) synchronizedBlockCounter.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) synchronizedBlockCounter.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final count with synchronized block: " + synchronizedBlockCounter.getCount());
    }

}
