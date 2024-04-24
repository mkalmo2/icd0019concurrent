package concurrent.examples;

import java.util.stream.LongStream;

public class Util {

    public static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        return LongStream
                .rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }

}
