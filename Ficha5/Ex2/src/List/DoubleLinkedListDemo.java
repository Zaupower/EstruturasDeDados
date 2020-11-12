package List;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;

import java.util.Iterator;

public class DoubleLinkedListDemo {
    public static void main(String[] args) throws EmptyCollectionException, ElementNotFoundException {
        DoubleLinkOrderList<String> linkedList = new DoubleLinkOrderList<>();
        linkedList.add("1");

        linkedList.add("1");
        linkedList.peek();
        System.out.println("Segundo Peek");
        linkedList.add("3");
        linkedList.add("-3");
        linkedList.add("5");
        linkedList.add("2");
        System.out.println("PEEK");
        System.out.println(linkedList.toString());
        linkedList.peek();
        //linkedList.removeFirst();
        //linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Depois de removido o ultimo");
        linkedList.add("4");
        linkedList.add("1");
        linkedList.add("6");
        String rem = linkedList.remove("1");
        linkedList.remove("6");
        System.out.println("Rem: "+rem);
        System.out.println("Contem 6?   :    "+linkedList.contains("5"));
        linkedList.peek();
        System.out.println("ITERANDO:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("PEEK REVERSO");
        linkedList.peek();
        DoubleLinkUnorderedList<String> unorderedList = new DoubleLinkUnorderedList<>();
        unorderedList.addAtFront("1");
        unorderedList.addAtFront("2");
        System.out.println("UnorderedList"+ unorderedList.toString());
    }
}
