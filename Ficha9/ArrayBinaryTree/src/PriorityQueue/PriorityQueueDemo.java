package PriorityQueue;

import Exceptions.EmptyCollectionException;

import java.util.Iterator;

public class PriorityQueueDemo {
    public static void main(String[] args) throws EmptyCollectionException {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        priorityQueue.addElement("1 ", 4);
        priorityQueue.addElement("2 ", 3);
        priorityQueue.addElement("3 ", 2);
        priorityQueue.addElement("4 ", 1);


        Iterator<PriorityQueueNode<String>> iterator = priorityQueue.iteratorPostOrder();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(priorityQueue.removeNext().toString());
    }
}
