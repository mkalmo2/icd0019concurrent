package concurrent.examples;

import java.util.stream.IntStream;
import concurrent.Timer;

public class Streams {

    public static void main(String[] args) {

        Timer timer = new Timer();

        long count = IntStream.range(0, 200_000)
                .parallel()
                .filter(Common::isPrime)
                .count();

        System.out.println(count);

        System.out.println(timer.getPassedTime());

    }


}

