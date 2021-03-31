package queues;

public class QueueLinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    private class Node<T> {
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(T item) {
        var currentLast = last;
        last = new Node<>(item);
        if (isEmpty()) {
            first = last;
        } else {
            currentLast.next = last;
        }
    }

    public T dequeue() {
        var currentFirst = first;
        first = first.next;
        if(isEmpty()) last = null;
        return currentFirst.item;
    }
}
