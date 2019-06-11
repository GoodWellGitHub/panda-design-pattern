package com.org.hj.data.producerconsumer;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<PCData> queue;
    private static final int SLEEP_TIME = 1000;

    public Consumer(BlockingQueue<PCData> queue) {
     this.queue=queue;
    }

    @Override
    public void run() {
        System.out.println("start consumer id : " + Thread.currentThread().getId());
        Random random = new Random();
        try {
            while (true) {
                PCData data = queue.take();
                if (data != null) {
                    int re = data.getData() * data.getData();
                    System.out.println(MessageFormat.format("{0}*{1}={2}", data.getData(),data.getData(),re));
                    Thread.sleep(random.nextInt(SLEEP_TIME));
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
