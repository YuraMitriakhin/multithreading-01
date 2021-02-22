package com.gmail.yuramitryahin;

public class RunnableImpl implements Runnable {
    private Counter counter;

    public RunnableImpl(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getCount() < 100) {
            counter.increment();
            System.out.println(Thread.currentThread().getName() + ":" + counter.getCount());
        }
    }
}
