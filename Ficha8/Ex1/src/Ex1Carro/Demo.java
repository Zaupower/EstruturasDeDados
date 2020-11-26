package Ex1Carro;

import ListasEArrays.Exceptions.EmptyCollectionException;
import ListasEArrays.List.DoubleLinkOrderList;

public class Demo {
    public static void main(String[] args) throws EmptyCollectionException {
        /**
        Car[] arrayCarro = new Car[5];
        arrayCarro[0] = new Car("BMW", "Vermelho", "1111");
        arrayCarro[1] = new Car("Mercedes", "Amarelo", "2222");
        arrayCarro[2] = new Car("Fiat", "Verde", "3333");
        arrayCarro[3] = new Car("Peugout", "Preto", "4444");
        arrayCarro[4] = new Car("Audi", "Roxo", "5555");
        Car carEx = new Car("Mercedes", "Amarelo", "2222");

        int i = 5/2;
        System.out.println(i);
        boolean b = SortingAndSearching.linearSearch(arrayCarro, 0, arrayCarro.length-1, carEx);
        System.out.println(b);
        boolean bb = SortingAndSearching.binarySearch(arrayCarro, 0, arrayCarro.length, carEx);
        System.out.println(bb);
         **/

        //Metodo para uma lista duplamente ligada
        DoubleLinkOrderList<String> doubleLinkOrderList = new DoubleLinkOrderList<>();
        doubleLinkOrderList.add("1");
        doubleLinkOrderList.add("2");
        doubleLinkOrderList.add("3");
        doubleLinkOrderList.add("4");
        doubleLinkOrderList.add("4");
        doubleLinkOrderList.add("4");
        doubleLinkOrderList.add("4");
        boolean bb = SortingAndSearching.binarySearch(doubleLinkOrderList, 0, doubleLinkOrderList.size(), doubleLinkOrderList);



    }
}
