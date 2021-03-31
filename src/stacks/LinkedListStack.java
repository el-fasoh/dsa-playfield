package stacks;

public class LinkedListStack<T> {
    Node<T> first;

    private static class Node <T> {
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(T item) {
        var oldFirst = first;
        first = new Node<>(item);
        first.next = oldFirst;
    }

    public Node<T> pop() {
        var oldFirst = first;
        first = oldFirst.next;
        return oldFirst;
    }

}
