package Heap;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;

import java.util.Iterator;

public class LinkedHeapDemo {
    public static void main(String[] args) throws EmptyCollectionException {
        LinkedHeap<String> linkedHeap = new LinkedHeap<>();
        linkedHeap.addElement("1 ");
        linkedHeap.addElement("2 ");
        linkedHeap.addElement("3 ");
        linkedHeap.addElement("4 ");
        Iterator<String> iteratorHeap= linkedHeap.iteratorLevelOrder();
        while (iteratorHeap.hasNext()){
            System.out.println(iteratorHeap.next());
        }
        System.out.println("Removed min elemnt "+  linkedHeap.removeMin());
        System.out.println("Find minimum value "+linkedHeap.findMin());

        try {
            System.out.println("Find Elemnt 3 ,"+linkedHeap.find("7 "));
        }catch (ElementNotFoundException e){
            System.out.println(e.toString());
        }

        System.out.println("Contains elemnt 3 ,"+linkedHeap.contains("7 "));
        System.out.println("Get Root "+linkedHeap.getRoot());
        System.out.println("IsEmpty "+linkedHeap.isEmpty());
        System.out.println("Size "+linkedHeap.size());

    }
}
