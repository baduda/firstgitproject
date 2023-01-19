package mycollection;

import java.util.Arrays;

public class MyStack<T> {
    private Object[] values = new Object[2];
    private int size = 0;

    public void push(T value) {
        values[size] = value;
        size++;
        if (values.length == size) {
            values = Arrays.copyOf(values, (int) (size * 1.5));
        }
    }

    public T pop() {
        size--;
        return (T) values[size];
    }

    public int getSize() {
        return size;
    }
}
