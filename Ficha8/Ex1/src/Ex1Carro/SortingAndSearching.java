package Ex1Carro;

public class SortingAndSearching<T> {


    /**
     * Searches the specified array of objects using a
     * linear search algorithm.
     *
     * @param data the array to be sorted
     * @param min the integer representation of the min value
     * @param max the integer representation of the max value
     * @param target the element being searched for
     * @return true if the desired element is found
     */
    public static <T extends Comparable<? super T>> boolean
    linearSearch (T[] data, int min, int max, T target)
    {
        int index = min;
        boolean found = false;
        while (!found && index <= max)
        {
            if (data[index].compareTo(target) == 0)
                found = true;
            index++;
        }
        return found;
    }
    /**
     * Searches the specified array of objects using a
     * binary search algorithm.
     * @param data the array to be sorted
     * @param min the integer representation of the minimum value
     * @param max the integer representation of the maximum value
     * @param target the element being searched for
     * @return true if the desired element is found
     */
    public static <T extends Comparable<? super T>> boolean
    binarySearch (T[] data, int min, int max, T target){
        boolean found = false;
        int midpoint = (min + max) / 2; // determine the midpoint
        if (data[midpoint].compareTo(target) == 0)
            found = true;
        else if (data[midpoint].compareTo(target) > 0) {
            if (min <= midpoint - 1)
                found = binarySearch(data, min, midpoint - 1, target);
        }
        else if (midpoint + 1 <= max)
            found = binarySearch(data, midpoint + 1, max, target);
        return found;
    }
    /**
     * Sorts the specified array of integers using the selection
     * sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<? super T>> void
    selectionSort (T[] data) {
        int min;
        T temp;
        for (int index = 0; index < data.length-1; index++){
            min = index;
            for (int scan = index+1; scan < data.length; scan++)
                if (data[scan].compareTo(data[min])<0)
                    min = scan;
            /** Swap the values */
            temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
    }

}
