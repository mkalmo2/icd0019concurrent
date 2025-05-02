package concurrent.examples;

public class SyncInstance {

    private int x = 1;
    private int y = 0;

    public static void main(String[] args) {
        new SyncInstance().swap();
    }

    private void swap() {
        synchronized (this) {
            int tmp = x;

            x = y;

            y = tmp;
        }
    }

    private synchronized void swap2() {
        int tmp = x;

        x = y;

        y = tmp;
    }

}

