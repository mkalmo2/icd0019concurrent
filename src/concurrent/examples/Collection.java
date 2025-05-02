package concurrent.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Collection {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>(); // Collections.synchronizedMap

        Runnable r1 = () -> {
            map.put(1, 2);
            map.clear();
        };

        Runnable r2 = () -> {
            try {
                map.computeIfPresent(1, (key, oldValue) -> oldValue + 1);
            } catch (Exception e) {
                System.out.println(e);
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10000; i++) {
            pool.submit(r1);
            pool.submit(r2);
        }

        pool.close();
    }


}
