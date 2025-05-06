package concurrent.examples;

import java.util.concurrent.atomic.AtomicInteger;

public class ResultFromThreadManual {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger result = new AtomicInteger();

        Runnable task = () -> result.set(42);

        Thread thread = new Thread(task);

        thread.start();
        thread.join();

        System.out.println("Result: " + result.get());
    }

}