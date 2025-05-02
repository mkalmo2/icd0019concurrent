package concurrent.examples;

public class SyncBroken {

    private int a = 1;
    private int b = 0;

    public void swap() {
        int tmp = a;

        a = b;

        b = tmp;
    }

}

