package Heap;

import Exceptions.EmptyCollectionException;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayHeapDemo {
    public static void main(String[] args) throws EmptyCollectionException {

        ArrayHeap<String> arrayHeap = new ArrayHeap<>();
        arrayHeap.addElement("1");
        arrayHeap.addElement("2");
        arrayHeap.addElement("3");
        arrayHeap.addElement("4");
        arrayHeap.addElement("5");

        int action = menu(arrayHeap);

        Iterator<String> iteratorHeap= arrayHeap.iteratorLevelOrder();
        while (iteratorHeap.hasNext()){
            System.out.println(iteratorHeap.next());
        }
        System.out.println("Minimo: "+arrayHeap.findMin());

    }

    public static int menu(ArrayHeap arrayHeap) throws EmptyCollectionException {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("Array Heap already populated with 12345 values as strings");
        System.out.println("-------------------------\n");
        System.out.println("1 - remove minimum");
        System.out.println("2 - find minimum");
        System.out.println("3 - add element");
        System.out.println("4 - view Tree");
        System.out.println("5 - Quit");


        selection = input.nextInt();

        switch (selection){
            case 1:
                arrayHeap.removeMin();
                menu(arrayHeap);
            case 2:
                System.out.println("Minimo: "+arrayHeap.findMin());
                menu(arrayHeap);
            case 3:
                int  in = input.nextInt();
                Integer y = in;
                arrayHeap.addElement(y.toString());
                menu(arrayHeap);
            case 4:
                Iterator<String> iteratorHeap= arrayHeap.iteratorLevelOrder();
                while (iteratorHeap.hasNext()){
                    System.out.println(iteratorHeap.next());
                }
                menu(arrayHeap);
            case 5:
                return 0;

        }
        return selection;
    }
}
