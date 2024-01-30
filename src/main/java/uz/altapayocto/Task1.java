package uz.altapayocto;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {

    public static void main(String[] args) {
        final int threadCount = 100_000;
        final int poolSize = 10;

        ExecutorService executorService = Executors.newFixedThreadPool(poolSize);

        CountDownLatch latch = new CountDownLatch(threadCount);

        AtomicInteger counter1 = new AtomicInteger(0);
        AtomicInteger counter2 = new AtomicInteger(0);

        for (int i = 0; i < threadCount; i++) {
            executorService.submit(() -> {
                incrementCounters(counter1, counter2);
                latch.countDown();
            });
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            executorService.shutdown();
        }

        System.out.println("Counter1: " + counter1.get());
        System.out.println("Counter2: " + counter2.get());
    }

    private static void incrementCounters(AtomicInteger counter1, AtomicInteger counter2) {
        // Increment both counters atomically
        counter1.incrementAndGet();
        counter2.incrementAndGet();
    }
}

