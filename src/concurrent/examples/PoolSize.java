package concurrent.examples;

import concurrent.Timer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolSize {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(16); // vs 160

        Timer timer = new Timer();

        for (int i = 0; i < 100; i++) {
            pool.submit(Common::doEasyWork);
            //pool.submit(Common::doHardWork);
        }

        pool.close();

        System.out.println("\n" + timer.getPassedTime());

    }


}
