package com.diegodelacruz.codesignal.concurrency.threads;

// TODO: Implement GreenLight class implementing Runnable
// TODO: In run(), print "Green Light ON", then sleep for 4 seconds
// TODO: After sleep, print "Green Light OFF"
// TODO: Handle InterruptedException with try-catch
public class GreenLight implements Runnable {

    private String threadName;

    public GreenLight(String name) {
        this.threadName = name;
    }

    public void run() {
        try {
            System.out.println("Green Light ON");
            Thread.sleep(4000);
            System.out.println("Green Light OFF");
        } catch (InterruptedException e) {
            System.out.println(threadName + " has interrupted");
        }
    }

}