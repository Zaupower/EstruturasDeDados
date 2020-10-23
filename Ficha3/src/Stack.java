import java.util.Arrays;

public class Stack<T> implements StackADT<T> {

    private int MaxSize = 3;
    private T[] stack;
    private int size;

    public Stack() {
        stack = (T[]) new Object[MaxSize];
        size = 0;
    }

    public void push(T element) {

        if (size >= stack.length){
            int newSize = size + (size>>1);
            stack = Arrays.copyOf(stack, newSize);
        }
        stack[size++] = element;
    }

    @Override
    public T pop() {
        size--;
        T data = stack[size];
        stack[size] = null;
        return data;
    }

    @Override
    public T peek() {
        T data = stack[size-1];
        return data;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }else {
            return false;
        }
    }

    public int size() {
        return this.stack.length;
    }
    public String toString(){

        return null;
    }
}
