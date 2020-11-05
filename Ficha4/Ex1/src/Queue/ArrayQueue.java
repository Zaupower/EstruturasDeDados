package Queue;

import Exceptions.EmptyCollectionException;

import java.util.Arrays;

public class ArrayQueue<T> implements QueueADT<T> {

    T[] arrayDeQueue ;

    int SIZE = 5;

    int head = -1;
    int tail = -1;

    public ArrayQueue() {

        this.arrayDeQueue = (T[]) new Object[SIZE];
    }

    public ArrayQueue(int newSize) {
        this.SIZE = newSize;
        this.arrayDeQueue = (T[]) new Object[SIZE];
    }


    @Override
    public void enqueue(T element) throws EmptyCollectionException {
        if (head == arrayDeQueue.length-1){
            throw new EmptyCollectionException("Array cheio ");
        }else if (isEmpty()){
            head++;
            tail++;
        }else {
            head++;
        }
        arrayDeQueue[head] = element;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty()){
            throw new EmptyCollectionException("Array vazio nao e possivel eliminar");
        }else if ( head == tail ){
            head = -1;
            tail = -1;
        }else{
            tail++;
        }

        return arrayDeQueue[tail-1];
    }

    @Override
    public T first() throws EmptyCollectionException {
        if (isEmpty()){
            throw new EmptyCollectionException("Is empty");
        }
        return arrayDeQueue[tail];
    }

    //Testado
    @Override
    public boolean isEmpty() {
        if (head <= -1 && tail <= -1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int size() {
        return 0;
    }

    //Permite Aumentar a capacidade maxima do array em 2x mas nao vai ser utilizado
    private void expandCapacity() {
        Object[] var1 = (Object[])(new Object[this.arrayDeQueue.length * 2]);

        for(int var2 = 0; var2 < this.arrayDeQueue.length; ++var2) {
            var1[var2] = this.arrayDeQueue[var2];
        }

        this.arrayDeQueue = (T[]) var1;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "arrayDeQueue=" + Arrays.toString(arrayDeQueue) +
                '}';
    }
}
