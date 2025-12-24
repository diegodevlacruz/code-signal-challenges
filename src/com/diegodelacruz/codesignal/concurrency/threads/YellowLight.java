package com.diegodelacruz.codesignal.concurrency.threads;

// TODO: Implement YellowLight class implementing Runnable
// TODO: In run(), print "Yellow Light ON", then sleep for 2 seconds
// TODO: After sleep, print "Yellow Light OFF"
// TODO: Handle InterruptedException with try-catch
public class YellowLight implements Runnable {

    private String threadName;

    public YellowLight(String name) {
        this.threadName = name;
    }

    public void run() {
        try {
            System.out.println("Yellow Light ON");
            Thread.sleep(2000);
            System.out.println("Yellow Light OFF");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(threadName + " has interrupted");
        }
    }
}
