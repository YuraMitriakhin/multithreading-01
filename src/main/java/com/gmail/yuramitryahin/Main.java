package com.gmail.yuramitryahin;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable runnable = new RunnableImpl(counter);
        Thread firstThread = new Thread(runnable);
        Thread secondThread = new ThreadImpl(counter);
        firstThread.start();
        secondThread.start();
    }
}
