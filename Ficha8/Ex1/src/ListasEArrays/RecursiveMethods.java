package ListasEArrays;


import ListasEArrays.Exceptions.EmptyCollectionException;
import ListasEArrays.List.DoubleLinkOrderList;
import ListasEArrays.List.SinglyLinkedList;

public class RecursiveMethods<T> {


    public RecursiveMethods() {
    }

    public void recursivePrint(SinglyLinkedList<T> singlyLinkedList){
       // SinglyLinkedList<T> newSingleList = singlyLinkedList;
        if (singlyLinkedList.top() == null){
            return;
        }
        System.out.println(singlyLinkedList.pop());
        recursivePrint(singlyLinkedList);
    }

    //Da print do primeiro ao ultimo
    public void recursiveDoubleListPrint(DoubleLinkOrderList<T> doubleLinkOrderList){
        if (doubleLinkOrderList.isEmpty()){
            return;
        }
        System.out.println(doubleLinkOrderList.removeFirst());
        recursiveDoubleListPrint(doubleLinkOrderList);
    }

    public void recursiveDoubleListPrintDeTrasPraFernte(DoubleLinkOrderList<T> doubleLinkOrderList) throws EmptyCollectionException {
        if (doubleLinkOrderList.isEmpty()){
            return;
        }
        System.out.println(doubleLinkOrderList.removeLast());
        recursiveDoubleListPrintDeTrasPraFernte(doubleLinkOrderList);
    }

    boolean b = false;
    public void recursiveReplace(DoubleLinkOrderList<T> doubleLinkOrderList, T toReplace, T replace){
        if (!doubleLinkOrderList.contains(toReplace)){
            return;
        }
        T next = doubleLinkOrderList.containsWithReturn(toReplace, replace);
        recursiveReplace(doubleLinkOrderList, toReplace, replace);
    }

    SinglyLinkedList<T> singlyLinkedListTMP = new SinglyLinkedList<>();
    public void recursiveSingleListInvertor(SinglyLinkedList<T> singlyLinkedList) {
        if (singlyLinkedList.isEmpty()){
            return;
        }
        singlyLinkedListTMP.push(singlyLinkedList.recursiveGetLast());
        System.out.println(singlyLinkedListTMP.toString());
        singlyLinkedList.pop();
        recursiveSingleListInvertor(singlyLinkedList);
    }
}
