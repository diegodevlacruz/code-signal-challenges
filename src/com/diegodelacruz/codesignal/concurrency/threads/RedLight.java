package com.diegodelacruz.codesignal.concurrency.threads;

// TODO: Implement RedLight class implementing Runnable
// TODO: In run(), print "Red Light ON", then sleep for 5 seconds
// TODO: After sleep, print "Red Light OFF"
// TODO: Handle InterruptedException with try-catch
public class RedLight implements Runnable {

    private String threadName;

    public RedLight(String name) {
        this.threadName = name;
    }

    public void run() {
        try {
            System.out.println("Red Light ON");
            Thread.sleep(5000);
            System.out.println("Red Light OFF");
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(threadName + " has interrupted");
        }
    }

}
