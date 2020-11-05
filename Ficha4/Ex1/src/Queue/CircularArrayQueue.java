package Queue;

import Exceptions.EmptyCollectionException;

import java.util.Arrays;

public class CircularArrayQueue<T> implements QueueADT<T> {

    T[] circularArrayDeQueue ;

    int SIZE = 5;

    int head = -1;
    int tail = -1;
    int count = 0;

    public CircularArrayQueue() {

        this.circularArrayDeQueue = (T[]) new Object[SIZE];
    }

    public CircularArrayQueue(int newSize) {
        this.SIZE = newSize;
        this.circularArrayDeQueue = (T[]) new Object[SIZE];
    }


    @Override
    public  void enqueue(T element) throws EmptyCollectionException {
        if (((head+1)% circularArrayDeQueue.length) == tail){
            expandCapacity();
        }else if (isEmpty()){
            head++;
            tail++;
        }else {
            head= (head+1)%circularArrayDeQueue.length;
        }
        circularArrayDeQueue[head] = element;
        count++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty()){
            throw new EmptyCollectionException("Array vazio nao e possivel eliminar");
        }else if (  head!= 0 && tail != 0  && head == tail ){

            head = -1;
            tail = -1;
            return circularArrayDeQueue[tail+1];
        }else
            tail= (tail+1)% circularArrayDeQueue.length;
        count--;
        return circularArrayDeQueue[tail];
    }

    @Override
    public T first() throws EmptyCollectionException {
        if (isEmpty()){
            throw new EmptyCollectionException("Is empty");
        }
        return circularArrayDeQueue[tail];
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
        return count;
    }

    //Permite Aumentar a capacidade maxima do array em 2x
    public void expandCapacity()
    {
        T[] larger = (T[])(new Object[circularArrayDeQueue.length *2]);

        for(int scan=0; scan < count; scan++)
        {
            larger[scan] = circularArrayDeQueue[tail];
            tail=(tail+1) % circularArrayDeQueue.length;
        }

        tail = 0;
        head = count;
        circularArrayDeQueue = larger;
    }

    @Override
    public String toString() {
        return "CircularArrayQueue{" +
                "arrayDeQueue=" + Arrays.toString(circularArrayDeQueue) +
                '}';
    }

    public CircularArrayQueue merge(CircularArrayQueue circularArrayQueue1, CircularArrayQueue circularArrayQueue2) throws EmptyCollectionException {
        while (!circularArrayQueue2.isEmpty()){

            circularArrayQueue1.enqueue(circularArrayQueue2.dequeue());
        }
        System.out.println("Merge try: "+circularArrayQueue1.toString());
        return circularArrayQueue1;
    }
}