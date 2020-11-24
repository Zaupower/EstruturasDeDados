import Exceptions.EmptyCollectionException;
import List.DoubleLinkOrderList;
import List.SinglyLinkedList;
import Node.DoubleNode;

public class Demo {
    public static void main(String[] args) throws EmptyCollectionException {

        //Metoddo recursivo para uma lista simples ligada
        /**
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.push("1");
        singlyLinkedList.push("1");
        singlyLinkedList.push("1");
        singlyLinkedList.push("1");
        singlyLinkedList.push("1");


        RecursiveMethods<String> recursiveMethods = new RecursiveMethods<>();
        recursiveMethods.recursivePrint(singlyLinkedList);


        //Metodo para uma lista duplamente ligada
        DoubleLinkOrderList<String> doubleLinkOrderList = new DoubleLinkOrderList<>();
        doubleLinkOrderList.add("1");
        doubleLinkOrderList.add("2");
        doubleLinkOrderList.add("3");
        doubleLinkOrderList.add("4");
        doubleLinkOrderList.add("4");
        doubleLinkOrderList.add("4");
        doubleLinkOrderList.add("4");

        System.out.println("PEEK ");
        //doubleLinkOrderList.peek(doubleLinkOrderList);
        System.out.println("End of PEEK ");
        RecursiveMethods<String> recursiveMethods = new RecursiveMethods<>();
        //recursiveMethods.recursiveDoubleListPrintDeTrasPraFernte(doubleLinkOrderList);
        //recursiveMethods.recursiveDoubleListPrint(doubleLinkOrderList);
        recursiveMethods.recursiveReplace(doubleLinkOrderList, "4", "500");
        recursiveMethods.recursiveDoubleListPrint(doubleLinkOrderList);
         **/

        RecursiveMethods<String> recursiveMethods = new RecursiveMethods<>();
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.push("1");
        singlyLinkedList.push("2");
        singlyLinkedList.push("3");
        singlyLinkedList.push("4");
        System.out.println(singlyLinkedList.recursiveGetLast());
        singlyLinkedList.pop();
        System.out.println(singlyLinkedList);
        //recursiveMethods.recursiveSingleListInvertor(singlyLinkedList);


    }
}
