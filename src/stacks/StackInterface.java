package stacks;

public interface StackInterface<T> {
    void push(T item);

    T pop();

    boolean isEmpty();

    int size();
}
