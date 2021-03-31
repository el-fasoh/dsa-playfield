package stacks;

public class LinkedListArray<T> implements StackInterface<T> {

    private T[] items = (T[]) new Object[1]; //100000
    private int N = 0;

    @Override
    public void push(T item) {
        if (N != 0 && N == items.length) {
            resizeArray(items.length * 2);
        }
        items[N++] = item;
    }

    private void resizeArray(int size) {
        T[] copy = (T[]) new Object[size];
        for (int i = 0; i < N; i++) {
            copy[i] = items[i];
        }
        items = copy;
    }

    @Override
    public T pop() {
        //[2,1]
        //Only resize if N is 1/4 array length
        //shrinking array (items.length/2)
        //check most recently added
        var item = items[--N];
        items[N] = null;
        if (N > 0 && N == items.length / 4) {
            resizeArray(items.length / 2);
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }

    public static void main(String[] args) {
        LinkedListArray<Integer> integers = new LinkedListArray<>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        integers.push(4);
        integers.push(5);
        integers.push(6);
        integers.push(7);
        integers.push(8);
        integers.push(9);
        integers.push(10);
        integers.push(11);
        integers.push(12);
        integers.push(13);
        integers.push(14);
        integers.push(15);
        integers.push(16);

        integers.pop();
        integers.pop();
        integers.pop();
        integers.pop();
        integers.pop();
        integers.pop();
        integers.pop();
        integers.pop();
        integers.pop();
        integers.pop();
        integers.pop();
        integers.pop();
        integers.pop();

    }
}
