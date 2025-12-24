package com.diegodelacruz.codesignal.concurrency.multithread;

import java.util.Random;

public class Downloader implements Runnable {
    private final String fileName;
    private final Random rnd;

    public Downloader(String fileName) {
        this.fileName = fileName;
        this.rnd = new Random();
    }

    @Override
    public void run() {
        try {
            synchronized (System.out) {
                System.out.println(Thread.currentThread().getName() + " - Starting download: " + fileName);
            }

            for (int i = 0; i < 10; i++) {
                Thread.sleep(rnd.nextInt(100) + 199);
                int percentage = (i + 1) * 10;
                synchronized (System.out) {
                    System.out.println(Thread.currentThread().getName() + " - " + fileName + ": " + percentage + "%");
                }

            }
            // TODO: Add a loop that simulates the download in steps, using sleep to
            // indicate progress
            // TODO: Synchronize the output of each progress step to prevent overlap
            synchronized (System.out) {
                System.out.println(Thread.currentThread().getName() + " - Completed download: " + fileName);
            }
        } catch (InterruptedException e) {
            synchronized (System.out) {
                System.out.println(Thread.currentThread().getName() + " - Download interrupted: " + fileName);
            }
        }
    }

    // TODO: Add a synchronized method called pauseDownload() that pauses the thread
    // for 500ms
    protected synchronized void pauseDownload() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(Thread.currentThread().getName() + " - Download interrupted: " + fileName);
        }

    }

}
