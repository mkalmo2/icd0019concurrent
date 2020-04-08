package concurrent.examples;

import concurrent.Timer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static concurrent.examples.Common.doWork;
import static concurrent.examples.Common.waitTillAllDone;

public class ParallelWithPool {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(2);

        Timer timer = new Timer();

        pool.submit(() -> doWork());
        pool.submit(() -> doWork());
        pool.submit(() -> doWork());

        waitTillAllDone(pool);

        System.out.println("\n" + timer.getPassedTime());
    }
}
