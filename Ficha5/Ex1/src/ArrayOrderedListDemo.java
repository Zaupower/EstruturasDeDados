import Exceptions.EmptyCollectionException;

import java.util.Iterator;

public class ArrayOrderedListDemo {
    public static void main(String[] args) throws EmptyCollectionException {
        ArrayOrderedList<String> arrayOrderedList = new ArrayOrderedList<>();

        arrayOrderedList.add("1");
        arrayOrderedList.add("0");

        System.out.println(arrayOrderedList.toString());
        arrayOrderedList.add("4");
        arrayOrderedList.add("-1");
        arrayOrderedList.add("3");
        System.out.println(arrayOrderedList.toString());
/**
        arrayOrderedList.add("2");
        arrayOrderedList.add("3");
        arrayOrderedList.add("4");
        arrayOrderedList.add("5");

        System.out.println(arrayOrderedList.toString());

        //String removed = arrayOrderedList.removeFirst();
        //System.out.println("Removed: "+removed);

        System.out.println(arrayOrderedList.toString());

        String removeLast = arrayOrderedList.removeLast();
        System.out.println(arrayOrderedList.toString());
        arrayOrderedList.remove("1");
        boolean b = arrayOrderedList.contains("1");
        System.out.println(b);
        //System.out.println(arrayOrderedList.toString());

        Iterator<String> iterator = arrayOrderedList.iterator();
        while (iterator.hasNext()) {
            String nextValue = iterator.next();
            System.out.println("The next value with Iterator is: " + nextValue);
        }
**/

    }
}
