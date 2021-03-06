package com.gmail.yuramitryahin;

import org.apache.log4j.Logger;

public class ThreadImpl extends Thread {
    private static final Logger logger = Logger.getLogger(ThreadImpl.class);
    private Counter counter;

    public ThreadImpl(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getCount() < 100) {
            int result = counter.increment();
            logger.info(Thread.currentThread().getName() + ":" + result);
        }
    }
}
