package concurrent.examples;

import java.util.Random;
import java.util.stream.IntStream;

public class Common {

    public static void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doEasyWork() {
        for (int i = 0; i < 5; i++) {
            sleep(100);
        }
    }

    public static int doHardWork() {
        Random r = new Random(0);

        return IntStream.range(1, 1_000_000)
                .mapToObj(r::nextInt)
                .sorted()
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        return IntStream
                .rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }

}
