import Exceptions.EmptyCollectionException;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayOrderedList<T> extends ArrayList<T> implements OrderedListADT<T> {

    @Override
    public void add(T element) throws EmptyCollectionException {
        if (element instanceof Comparable){
            if (isEmpty()){
                list[0] = element;
                index++;
            }else {
                Comparable posAtras = (Comparable) list[index-1];

                if (posAtras.compareTo(element) <= 0){
                    list[index] = element;
                    index++;
                }else {
                    int it = 0;
                    boolean b = false;
                    while (it < index && b == false){
                        Comparable<T> tmp = (Comparable<T>) list[it];
                        if (tmp.compareTo(element) > 0 ){
                            b = true;
                        }else {
                            it++;
                        }
                    }

                    if (b){
                        for (int i = index-1; i>=it; i--){
                            list[i+ 1] = list[i];
                        }
                        list[it] = element;
                        index++;
                    }
                }
            }

        }else {
            System.out.println("Obj nao e instancia de Comparable");
        }
    }
}
