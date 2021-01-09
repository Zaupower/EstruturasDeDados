package BinaryTree;

import ArrayListImplementation.ArrayUnorderedList;
import Exceptions.ElementNotFoundException;

import java.util.Iterator;

public class ArrayBinaryTree<T> implements BinaryTreeADT<T> {
    protected int count;
    protected T[] tree;
    private final int CAPACITY = 50;

    /**
     * Creates an empty binary tree.
     */
    public ArrayBinaryTree() {
        count = 0;
        tree = (T[]) new Object[CAPACITY];
    }

    /**
     * Creates a binary tree with the specified element as its root.
     *
     * @param element the element which will become the root
     *                of the new tree
     */
    public ArrayBinaryTree(T element) {
        count = 1;
        tree = (T[]) new Object[CAPACITY];
        tree[0] = element;
    }

    @Override
    public T getRoot() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(T targetElement) {
        boolean found = false;

        for (int ct=0; ct<count && !found; ct++)
            if (targetElement.equals(tree[ct]))
                found = true;

        return found;
    }

    /**
     * Returns a reference to the specified target element if it is
     * found in this binary tree. Throws a NoSuchElementException if
     * the specified target element is not found in the binary tree.
     *
     * @param targetElement the element being sought in the tree
     * @return true if the element is in the tree
     * @throws ElementNotFoundException if an element not found
     *                                  exception occurs
     */
    public T find(T targetElement) throws ElementNotFoundException {
        T temp = null;
        boolean found = false;

        for (int ct = 0; ct < count && !found; ct++)
            if (targetElement.equals(tree[ct])) {
                found = true;
                temp = tree[ct];
            }
        if (!found)
            throw new ElementNotFoundException("binary tree");
        return temp;
    }

    @Override
    public Iterator<T> iteratorInOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<T>();
        inorder (0, templist);

        return templist.iterator();
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<T>();
        preorder (0, templist);

        return templist.iterator();
    }

    private void preorder(int node, ArrayUnorderedList<T> templist) {
        if (node < tree.length)
            if (tree[node] != null)
            {
                templist.addToRear(tree[node]);
                inorder (node*2+1, templist);
                inorder ((node+1)*2, templist);
            }

    }

    @Override
    public Iterator<T> iteratorPostOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<T>();
        postorder (0, templist);

        return templist.iterator();
    }

    private void postorder(int node, ArrayUnorderedList<T> templist) {
        if (node < tree.length)
            if (tree[node] != null)
            {
                inorder (node*2+1, templist);
                inorder ((node+1)*2, templist);
                templist.addToRear(tree[node]);
            }
    }

    @Override
    public Iterator<T> iteratorLevelOrder() {
        ArrayUnorderedList<T> tempList = new ArrayUnorderedList<T>();
        int ct = 0; // current number of elements added to list
        int i = 0; // current position in array

        while (ct < count)
        {
            if (tree[i] != null)
            {
                tempList.addToRear(tree[i]);
                ct++;
            }
            i++;
        }

        return tempList.iterator();
    }


    /**
     * Performs a recursive inorder traversal.
     *
     * @param node the node used in the traversal
     * @param templist the temporary list used in the traversal
     */
    protected void inorder (int node, ArrayUnorderedList<T> templist){
        if (node < tree.length)
            if (tree[node] != null){
                inorder (node*2+1, templist);
                templist.addToRear(tree[node]);
                inorder ((node+1)*2, templist);
            }
    }
    protected void expandCapacity()
    {
        T[] temp = (T[]) new Object[tree.length * 2];
        for (int ct=0; ct < tree.length; ct++)
            temp[ct] = tree[ct];
        tree = temp;
    }

    public void removeAllElements()
    {
        count = 0;
        for (int ct=0; ct<tree.length; ct++)
            tree[ct] = null;
    }

    @Override
    public String toString() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<T>();
        inorder (0, templist);

        return templist.toString();
    }
}