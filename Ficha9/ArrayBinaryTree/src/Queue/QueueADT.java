package Queue;

import Exceptions.EmptyCollectionException;

public interface QueueADT<T>
{
    //  Adds one element to the rear of the queue
    public void enqueue (T element);

    //  Removes and returns the element at the front of the queue
    public T dequeue() throws EmptyCollectionException;

    //  Returns without removing the element at the front of the queue
    public T first() throws EmptyCollectionException;

    //  Returns true if the queue contains no elements
    public boolean isEmpty();

    //  Returns the number of elements in the queue
    public int size();

    //  Returns a string representation of the queue
    public String toString();
}
