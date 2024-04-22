package concurrent.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Runnable addElements = () -> {
            for (int i = 0; i < 10_000; i++) {
                list.add(i);
            }
        };

        Thread thread1 = new Thread(addElements);
        Thread thread2 = new Thread(addElements);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Size: " + list.size());
    }
}
