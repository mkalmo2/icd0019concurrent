package concurrent.examples;

public class SyncGlobal {

    private static final Object LOCK = new Object();

    private static int a = 1;
    private static int b = 0;

    public static void swap() {
        synchronized (LOCK) {
            int tmp = a;

            a = b;

            b = tmp;
        }
    }

    static void main() throws InterruptedException {
        Runnable r1 = () -> {
            for (int i = 0; i < 10000; i++) {
                SyncGlobal.swap();
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 10000; i++) {
                SyncGlobal.swap();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(a);
        System.out.println(b);
    }


}

