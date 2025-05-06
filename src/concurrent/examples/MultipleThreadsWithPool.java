package concurrent.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import concurrent.Timer;

public class MultipleThreadsWithPool {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(24);

        Timer timer = new Timer();

        for (int i = 0; i < 100; i++) {
            pool.submit(Common::doHardWork);
        }

        pool.close();

        System.out.println("\n" + timer.getPassedTime());

    }


}
