package com.gmail.yuramitryahin;

import org.apache.log4j.Logger;

public class RunnableImpl implements Runnable {
    private static final Logger logger = Logger.getLogger(RunnableImpl.class);
    private Counter counter;

    public RunnableImpl(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getCount() < 100) {
            int result = counter.increment();
            logger.info(Thread.currentThread().getName() + ":" + result);
        }
    }
}
