package concurrent.examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.LongStream;

public class ResultFromPool {

    public static void main(String[] args) throws Exception {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        Callable<Long> c1 = () -> sumPrimes(2, 100_000);
        Callable<Long> c2 = () -> sumPrimes(100_001, 200_000);
        Callable<Long> c3 = () -> sumPrimes(200_001, 300_000);

        Future<Long> f1 = pool.submit(c1);
        Future<Long> f2 = pool.submit(c2);
        Future<Long> f3 = pool.submit(c3);

        System.out.println(f1);

        System.out.println(f1.get() + f2.get() + f3.get());

        System.out.println(f1);

        pool.shutdown();
    }

    private static long sumPrimes(int start, int end) {
        return LongStream.rangeClosed(start, end)
                .filter(Util::isPrime)
                .sum();
    }

}
