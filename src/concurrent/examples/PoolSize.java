package concurrent.examples;

import concurrent.Timer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static concurrent.examples.Common.doHardWork;
import static concurrent.examples.Common.waitTillAllDone;

public class PoolSize {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(1);

        Timer timer = new Timer();

        for (int i = 0; i < 1; i++) {
            pool.submit(() -> doHardWork());
        }

        waitTillAllDone(pool);

        System.out.println("\n" + timer.getPassedTime());
    }


}
