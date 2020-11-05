import Exceptions.EmptyCollectionException;
import Queue.ArrayQueue;
import Queue.CircularArrayQueue;

public class main {


    public static void main(String[] args) throws EmptyCollectionException {

        ArrayQueue<String> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue("1");
        arrayQueue.enqueue("2");
        arrayQueue.enqueue("3");
        arrayQueue.enqueue("4");
        System.out.println(arrayQueue.toString());
        arrayQueue.enqueue("5");

        System.out.println(arrayQueue.isEmpty());
        System.out.println(arrayQueue.toString());
        System.out.println("Dequeue: "+arrayQueue.dequeue());
        System.out.println(arrayQueue.toString());
        //arrayQueue.enqueue("5");
        System.out.println("first "+arrayQueue.first());

        CircularArrayQueue<String> circularArrayQueue = new CircularArrayQueue<>();
        circularArrayQueue.enqueue("1");
        circularArrayQueue.enqueue("2");
        circularArrayQueue.enqueue("3");
        circularArrayQueue.enqueue("4");
        System.out.println(circularArrayQueue.toString());
        circularArrayQueue.enqueue("5");

        System.out.println(circularArrayQueue.isEmpty());
        System.out.println(circularArrayQueue.toString());
        System.out.println("Circular Dequeue: "+circularArrayQueue.dequeue());
        System.out.println(circularArrayQueue.toString());
        circularArrayQueue.enqueue("5");
        System.out.println("Circular first "+circularArrayQueue.first());
        circularArrayQueue.enqueue("5");
        System.out.println(circularArrayQueue.toString());

        //Merge test
        CircularArrayQueue<String> circularArrayQueueT1 = new CircularArrayQueue<>();
        circularArrayQueueT1.enqueue("1");
        circularArrayQueueT1.enqueue("2");
        CircularArrayQueue<String> circularArrayQueueT2 = new CircularArrayQueue<>();
        circularArrayQueueT2.enqueue("3");
        circularArrayQueueT2.enqueue("4");

        CircularArrayQueue<String> circularArrayQueueT3 = new CircularArrayQueue<>();
        circularArrayQueueT3.merge(circularArrayQueueT1,circularArrayQueueT2);
        System.out.println("Merged: "+circularArrayQueueT3.toString());



    }

}
