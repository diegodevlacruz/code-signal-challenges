package com.diegodelacruz.codesignal.concurrency.threads;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // TODO: Create threads for red, green, and yellow lights
        Thread t1 = new Thread(new GreenLight("Green Light"));
        Thread t2 = new Thread(new YellowLight("Yellow Light"));
        Thread t3 = new Thread(new RedLight("Red Light"));

        // TODO: Start the light threads in correct order
        // TODO: Use join to make sure each thread finishes before starting the next one
        t3.start();
        t3.join();
        t1.start();
        t1.join();
        t2.start();

    }
}
