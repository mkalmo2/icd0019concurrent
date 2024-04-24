package concurrent.examples;

public class SyncInstance {

    private int x = 1;
    private int y = 0;

    private void swapVariables() {
        synchronized (this) {
            int tmp = x;

            x = y;

            y = tmp;
        }
    }

    private synchronized void swapVariables2() {
        int tmp = x;

        x = y;

        y = tmp;
    }

}

