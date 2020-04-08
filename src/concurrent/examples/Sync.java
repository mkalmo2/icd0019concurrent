package concurrent.examples;

public class Sync {

    private static final Object lock = new Object();

    private static int a = 1;
    private static int b = 0;

    private int x = 1;
    private int y = 0;

    public static void main(String[] args) {
        new Sync().runExample();
    }

    public void runExample() {

        swapVariables();

        System.out.println(a);
        System.out.println(b);
    }

    private void swapVariables() {

        synchronized (lock) {
            int tmp = a;

            a = b;

            b = tmp;
        }
    }

    private void swapVariables2() {
        synchronized (this) {
            int tmp = x;

            x = y;

            y = tmp;
        }
    }

    private synchronized void swapVariables3() {
        int tmp = x;

        x = y;

        y = tmp;
    }

}

