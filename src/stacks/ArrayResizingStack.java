package stacks;

public class ArrayResizingStack<T> {
    private T[] items = (T[]) new Object[1];
    private int N = 0;

    public void push(T item) {
        if (N == items.length)
            resize(items.length * 2);
        items[N++] = item;
    }

    public void resize(int length) {
        T[] copy = (T[]) new Object[length];
        for (int i = 0; i < items.length; i++) {
            copy[i] = items[i];
        }
        items = copy;
    }

    public T pop() {
        T item = items[--N];
        items[N] = null;
        if(N > 0 && N == items.length / 4 ){
            resize(items.length / 2);
        }
        return item;
    }

}
