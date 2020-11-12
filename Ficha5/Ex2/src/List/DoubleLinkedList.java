package List;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import Node.DoubleNode;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T>  implements ListADT<T>{


    protected int size;
    protected DoubleNode<T> head, tail;

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    @Override
    public T removeFirst() {
        if (isEmpty()) {
            System.out.println("Erro Lista vazia");
        }

        DoubleNode<T> newHead = head.getNext();
        this.head = newHead;
        return ((T) this.head);
    }

    @Override
    public T removeLast() throws EmptyCollectionException {
        DoubleNode<T> oldTail = tail;
        DoubleNode<T> newTail = tail.getPrev();
        this.tail = newTail;
        return (T) oldTail;
    }
    /**
     * Removes the first instance of the specified element from this
     * list and returns a reference to it.
     * Throws an EmptyListException
     * if the list is empty. Throws a NoSuchElementException if the
     * specified element is not found in the list.
     */

    //FALTA DEFINIR O PREVIOS QUANDO SE REMOVE
    public T remove (T targetElement)
            throws EmptyCollectionException, ElementNotFoundException {
        if (isEmpty())
            throw new EmptyCollectionException ("List");

        boolean found = false;
        DoubleNode<T> previous = null;
        DoubleNode<T> current = head;

        while (current != null && !found)
            if (targetElement.equals (current.getElement()))
                found = true;
            else
            {
                previous = current;
                current = current.getNext();
            }

        if (!found)
            throw new ElementNotFoundException ("List");

        if (size() == 1)
            head = tail = null;
        else if (current.equals (head))
            head = current.getNext();
        else if (current.equals (tail))
        {
            tail = previous;
            tail.setNext(null);
        }
        else
            previous.setNext(current.getNext());

        size--;

        return current.getElement();
    }
    @Override
    public T first() throws EmptyCollectionException {
        if (isEmpty()){

        }
        return (T) this.head;
    }

    @Override
    public T last() throws EmptyCollectionException {
        if (isEmpty()){

        }
        return (T) tail;
    }

    @Override
    public boolean contains(T target)  {
        if (isEmpty())
            return false;

        boolean found = false;
        DoubleNode<T> current = head;

        while (current != null && !found)
            if (target.equals (current.getElement()))
                found = true;
            else
            {
                current = current.getNext();
            }
        return found;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        else return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return new DoubleLinkListIterator<T>();
    }

    protected class DoubleLinkListIterator<T> implements Iterator<T>{
        int count = 0;
        DoubleNode<T> current = null;
        @Override
        public boolean hasNext() {
            if (current == null &&  head != null){
                return true;
            }else if (current != null){
                return current.getNext() != null;
            }
            return false;
        }

        @Override
        public T next() {
            if (current == null && head != null){
                current = (DoubleNode<T>) head;
                return (T) head.getElement();
            }else if (current != null){
                current = current.getNext();
                return current.getElement();
            }
            throw new NoSuchElementException();
        }
    }

    @Override
    public String toString() {
        String text = "";
        Iterator<T> itr = iterator();

        while (itr.hasNext()) {
            text += "\n" + itr.next().toString();
        }

        return text;
    }


    public void peek() {
        DoubleNode<T> current = head;
        while (current != null) {
            System.out.println(current.toString());
            current = current.getNext();
        }
    }
}
