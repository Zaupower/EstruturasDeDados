import Exceptions.EmptyCollectionException;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<T> implements ListADT<T>{

    private static int MAX = 6;
    protected  T[] list;
    protected  int index;

    public ArrayList() {
        this.list = (T[]) new Object[MAX];
        index = 0;
    }

    public ArrayList(T[] list) {
        this.list = list;
        index = 0;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()){
            return null;
        }
        T objRemoved = list[0];
        for (int i = 0; i< index -1; i++){
            list[i] = list[i+1];
        }
        //list[index-1] = null;
        index--;
        return objRemoved;
    }

    @Override
    public T removeLast() throws EmptyCollectionException {
        if (isEmpty()){
            throw new EmptyCollectionException("Posiçao Vazia");
        }

        T objRemoved = list[index-1];
        list[index-1] = null;
        index--;
        return objRemoved;
    }

    @Override
    public T remove(T element) throws EmptyCollectionException {
        T removido = null;
        int pos = -1;
        for (int i=0; i< index;i++){
            if (list[i].equals(element)){
                removido = list[i];
                pos = i;
            }
        }
        if (pos == -1){
            throw new EmptyCollectionException("Nao Encontrado");
        }
        for (int j =pos ;j<index-1;j++ ){
            list[j] = list[j+1];
        }
        list[index-1] = null;
        return removido;
    }

    @Override
    public T first() throws EmptyCollectionException {
        if (isEmpty()){
            throw new EmptyCollectionException("Lista vazia");
        }
        return list[0];
    }

    @Override
    public T last() throws EmptyCollectionException {
        if (isEmpty()){
        throw new EmptyCollectionException("Lista vazia");
    }
        return list[index];
    }

    @Override
    public boolean contains(T target) {
        boolean validator = false;
        int pos = -1;
        for (int i=0; i< index;i++){
            if (list[i].equals(target)){
                validator = true;
            }
        }
        return validator;
    }

    @Override
    public boolean isEmpty() {
        if (index == 0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator<T> iterator() {

        return new ArrayListIterator<T>();
    }

    private class ArrayListIterator<T> implements Iterator<T>{

        int current = 0;


        @Override
        public boolean hasNext() {

            if (current < index){
                return true;
            }
            return false;
        }

        @Override
        public T next() {

            if (this.hasNext())
                return (T) list[current++];
            return null;
        }
    }
    @Override
    public String toString() {
        return "ArrayOrderedList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
