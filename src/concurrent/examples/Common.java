package concurrent.examples;

import java.util.concurrent.ExecutorService;

public class Common {

    public static void waitTillAllDone(ExecutorService service) {
        service.shutdown();
        while (!service.isTerminated()) {
            sleep(1);
        }
    }

    public static void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doEasyWork() {
        for (int i = 0; i < 10; i++) {
            sleep(100);
        }
        System.out.print(".");
    }

    public static void doHardWork() {
        for (int i = 0; i < 1.2e9; i++) {
        }
        System.out.print(".");
    }

    public static void doWork() {
        doHardWork();
    }


}
