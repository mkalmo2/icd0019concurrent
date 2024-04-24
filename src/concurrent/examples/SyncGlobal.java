package concurrent.examples;

public class SyncGlobal {

    private static final Object LOCK = new Object();

    private int a = 1;
    private int b = 0;

    public void swapVariables() {

        synchronized (LOCK) {
            int tmp = a;

            a = b;

            b = tmp;
        }

        System.out.println(a);
        System.out.println(b);
    }
}

