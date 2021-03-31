package stacks;

public class ArrayStack <T extends  Object> {

    private T[] items;
    private int last = 0;

    public ArrayStack(int capacity) {
        items = (T[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return last == 0;
    }

    public void push(T item){
        items[last++] = item;
    }

    public T pop(){
        T item = items[--last];
        items[last] = null;
        return item;
    }

    public static void main(String[] args) {
        ArrayStack<String> strings = new ArrayStack<>(2);
        strings.push("Elphas");
        strings.push("Anthony");
        System.out.println(strings.pop());
        System.out.println(strings.pop());
        System.out.println(strings.isEmpty());
    }
}
