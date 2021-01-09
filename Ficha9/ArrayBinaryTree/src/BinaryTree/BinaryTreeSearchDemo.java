package BinaryTree;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;

import java.util.Iterator;

public class BinaryTreeSearchDemo {

    public static void main(String[] args) throws ElementNotFoundException, EmptyCollectionException {
        LinkedBinarySearchTree<String> linkedBinarySearchTree = new LinkedBinarySearchTree("1");

        linkedBinarySearchTree.addElement("-1");

        linkedBinarySearchTree.addElement("3");
        linkedBinarySearchTree.addElement("4");
        linkedBinarySearchTree.addElement("5");
        linkedBinarySearchTree.addElement("5");
        linkedBinarySearchTree.addElement("5");

        Iterator<String> iteratorInOrder = linkedBinarySearchTree.iteratorInOrder();
        while (iteratorInOrder.hasNext()){
            System.out.println(iteratorInOrder.next());
        }
        linkedBinarySearchTree.removeAllOccurrences("5");

        System.out.println("Depois de remover todas as instancias de 5");
        Iterator<String> iteratorInOrder2 = linkedBinarySearchTree.iteratorInOrder();
        while (iteratorInOrder2.hasNext()){
            System.out.println(iteratorInOrder2.next());
        }

        //remove minimum value
        linkedBinarySearchTree.removeMin();
        System.out.println("Depois de remover o elemento menor ");
        Iterator<String> iteratorInOrder3 = linkedBinarySearchTree.iteratorInOrder();
        while (iteratorInOrder3.hasNext()){
            System.out.println(iteratorInOrder3.next());
        }
        //remove max value
        linkedBinarySearchTree.removeMax();
        System.out.println("Depois de remover o elemento maior ");
        Iterator<String> iteratorInOrder4 = linkedBinarySearchTree.iteratorInOrder();
        while (iteratorInOrder4.hasNext()){
            System.out.println(iteratorInOrder4.next());
        }








    }
}
