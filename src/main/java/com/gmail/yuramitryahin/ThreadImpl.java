package com.gmail.yuramitryahin;

public class ThreadImpl extends Thread {
    private Counter counter;

    public ThreadImpl(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getCount() < 100) {
            counter.increment();
            System.out.println(Thread.currentThread().getName() + ":" + counter.getCount());
        }
    }
}
