import ArrayListIMplementation.ArrayUnorderedList;
import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import Queue.LinkedQueue;

import java.util.Iterator;

/**
 * LinkedBinaryTree implements the BinaryTreeADT interface
 *
 */
public class LinkedBinaryTree<T> implements BinaryTreeADT<T> {
    protected int count;
    public BinaryTreeNode<T> root;

    /**
     * Creates an empty binary tree.
     */
    public LinkedBinaryTree() {
        count = 0;
        root = null;
    }

    /**
     * Creates a binary tree with the specified element as its root.
     *
     * @param element the element that will become the root of the
     *                new binary tree
     */
    public LinkedBinaryTree(T element) {
        count = 1;
        root = new BinaryTreeNode<T>(element);
    }


    @Override
    public T getRoot() {
        if (isEmpty()){
            return null;
        }
        return root.element;
    }

    @Override
    public boolean isEmpty() {
        if (count< 1){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(T targetElement) {
        T temp;
        boolean found = false;

        try
        {
            temp = find (targetElement);
            found = true;
        }//try

        catch (Exception ElementNotFoundException)
        {
            found = false;
        }//catch

        return found;
    }


    /**
     * Returns a reference to the specified target element if it is
     * found in this binary tree. Throws a NoSuchElementException if
     * the specified target element is not found in the binary tree.
     *
     * @param targetElement the element being sought in this tree
     * @return a reference to the specified target
     * @throws ElementNotFoundException if an element not found
     * exception occurs
     */
    @Override
    public T find(T targetElement) throws ElementNotFoundException
    {
        BinaryTreeNode<T> current = findAgain( targetElement, root );

        if( current == null )
            throw new ElementNotFoundException("binary tree");

        return (current.element);
    }

    /**
     * Returns a reference to the specified target element if it is
     * found in this binary tree.
     *
     * @param targetElement the element being sought in this tree
     * @param next the element to begin searching from
     */
    private BinaryTreeNode<T> findAgain(T targetElement,
                                        BinaryTreeNode<T> next) {
        if (next == null)
            return null;

        if (next.element.equals(targetElement))
            return next;

        BinaryTreeNode<T> temp = findAgain(targetElement, next.left);

        if (temp == null)
            temp = findAgain(targetElement, next.right);

        return temp;
    }


    /**
     * Performs an inorder traversal on this binary tree by calling an
     * overloaded, recursive inorder method that starts with
     * the root.
     *
     * @return an in order iterator over this binary tree
     *
     * IMPLEMENTADO
     */
    @Override
    public Iterator<T> iteratorInOrder() {
        ArrayUnorderedList<T> tempList = new ArrayUnorderedList<T>();
        inorder (root, tempList);

        return tempList.iterator();
    }

    //IMPLEMENTADO
    @Override
    public Iterator<T> iteratorPreOrder() {
        ArrayUnorderedList<T> tempList = new ArrayUnorderedList<T>();
        preorder (root, tempList);

        return tempList.iterator();
    }

    //Implementado
    @Override
    public Iterator<T> iteratorPostOrder() {
        ArrayUnorderedList<T> tempList = new ArrayUnorderedList<T>();
        postorder (root, tempList);

        return tempList.iterator();
    }

    //Implementar
    @Override
    public Iterator<T> iteratorLevelOrder() throws EmptyCollectionException {

        ArrayUnorderedList<T> tempList = new ArrayUnorderedList<T>();
        levelorder (root, tempList);

        return tempList.iterator();
    }

    private void levelorder(BinaryTreeNode<T> node, ArrayUnorderedList<T> tempList) throws EmptyCollectionException {
        //Queue<BinaryTreeNode<T>> queue = (Queue<BinaryTreeNode<T>>) new ArrayUnorderedList<BinaryTreeNode<T>>();

        LinkedQueue<BinaryTreeNode<T>> queue = new LinkedQueue<>();
        queue.enqueue(root);
        while (!queue.isEmpty()){
            /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/
            util/linkedlist_poll.htm */
            BinaryTreeNode<T> tempNode = queue.dequeue();
            //System.out.print(tempNode.element + " ");
            tempList.addToRear(tempNode.element);
            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.enqueue(tempNode.left);
            }
            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.enqueue(tempNode.right);
            }
        }
    }

    /**
     * Performs a recursive inorder traversal.
     *
     * @param node the node to be used as the root
     * for this traversal
     * @param tempList the temporary list for use in this traversal
     *
     * IMPLEMENTADO
     */
    protected void inorder (BinaryTreeNode<T> node,
                            ArrayUnorderedList<T> tempList) {
        if (node != null) {
            inorder (node.left, tempList);
            tempList.addToRear(node.element);
            inorder (node.right, tempList);
        }
    }
    //A implementar por mim
    //Implementado com sucesso ver explicacao no caderno verde(noteIT)
    protected void preorder (BinaryTreeNode<T> node, ArrayUnorderedList<T> templist)
    {
        if (node != null)
        {
            templist.addToRear(node.element);
            preorder (node.left, templist);
            preorder (node.right, templist);
        }
    }
    //A implementar por mim
    //Implementado com sucesso ver explicacao no caderno verde(noteIT)
    private void postorder(BinaryTreeNode<T> node, ArrayUnorderedList<T> templist) {
        if (node != null){
            postorder (node.left, templist);
            postorder (node.right, templist);
            templist.addToRear(node.element);
        }
    }




    @Override
    public String toString() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<T>();
        preorder (root, templist);
        return templist.toString();
    }
}