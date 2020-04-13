package concurrent.examples;

public class ImmutableCounter {
    private int c;

    public ImmutableCounter(int c) {
        this.c = c;
    }

    public ImmutableCounter increment() {
        return new ImmutableCounter(c + 1);
    }

    public ImmutableCounter decrement() {
        return new ImmutableCounter(c - 1);
    }

    public int value() {
        return c;
    }
}