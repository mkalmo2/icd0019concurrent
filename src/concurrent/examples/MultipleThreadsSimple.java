package concurrent.examples;

import java.util.ArrayList;
import java.util.List;
import concurrent.Timer;

public class MultipleThreadsSimple {

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            Thread thread = new Thread(Common::doHardWork);

            thread.start();

            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("\n" + timer.getPassedTime());
    }

}
