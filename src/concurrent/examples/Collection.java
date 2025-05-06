package concurrent.examples;

import java.util.ArrayList;
import java.util.List;

public class Collection {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();
//        List<Integer> list = Collections.synchronizedList(new ArrayList<>()); //

        Runnable r1 = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(1);
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(list.size());
    }


}
