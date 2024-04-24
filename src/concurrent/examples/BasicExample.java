package concurrent.examples;

public class BasicExample {

    public static void main(String[] args) {

        Runnable r1 = () -> System.out.println(1);
        Runnable r2 = () -> System.out.println(2);
        Runnable r3 = () -> System.out.println(3);

        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();

        System.out.println("done");
    }
}

