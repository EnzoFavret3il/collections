package generalites;

import java.util.Iterator;

public class FiboIterator implements Iterator<Integer>, generalites.Iterator<Integer> {
    private int current = 0;
    private int next = 1;
    private int count = 0;
    private final int bound;

    public FiboIterator(int bound) {
        this.bound = bound;
    }

    @Override
    public boolean hasNext() {
        return count < bound;
    }

    @Override
    public Integer next() {
        int result = current;
        int temp = next;
        next = current + next;
        current = temp;
        count++;
        return result;
    }
}