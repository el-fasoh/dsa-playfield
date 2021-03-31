public class LinkedListStack<T> {
   private Node<T> first;
   private int size = 0;

    private class Node <T>{
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }
    }

    public void push(T item) {
        var currentFirst = first;
        first  = new Node<>(item);
        first.next = currentFirst;
        size++;
    }

    public T pop() {
        var oldFirst = first;
        first = oldFirst.next;
        size--;
        return oldFirst.item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }
}
