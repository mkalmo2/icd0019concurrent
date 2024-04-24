package concurrent.examples;

import concurrent.Timer;

import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {

        Timer timer = new Timer();

        long count = IntStream.range(0, 200_000)
                .parallel()
                .filter(Util::isPrime)
                .count();

        System.out.println(count);

        System.out.println(timer.getPassedTime());

    }

}

