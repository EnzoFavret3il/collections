package generalites;

public class Fibonacci implements Iterable<Integer> {
    private final int bound;

    public Fibonacci(int bound) {
        this.bound = bound;
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        return new FiboIterator(bound);
    }

    public static void main(String[] args) {
        for (Integer x : new Fibonacci(20))
            System.out.println(x);
    }
}
