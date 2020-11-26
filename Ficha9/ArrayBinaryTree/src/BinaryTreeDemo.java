import Exceptions.EmptyCollectionException;

import java.util.Iterator;

public class BinaryTreeDemo {
    public static void main(String[] args) throws EmptyCollectionException {
        LinkedBinaryTree<String> linkedBinaryTree = new LinkedBinaryTree<>("A");
        //System.out.println(linkedBinaryTree.toString());
        linkedBinaryTree.root.left = new BinaryTreeNode<>("B");
        linkedBinaryTree.root.right = new BinaryTreeNode<>("C");
        linkedBinaryTree.root.left.left = new BinaryTreeNode<>("D");
        linkedBinaryTree.root.left.right = new BinaryTreeNode<>("E");
        linkedBinaryTree.root.right.left = new BinaryTreeNode<>("F");
        linkedBinaryTree.root.right.right = new BinaryTreeNode<>("G");
        System.out.println("iteratorInOrder");
        Iterator<String> iteratorInOrder = linkedBinaryTree.iteratorInOrder();
        while (iteratorInOrder.hasNext()){
            System.out.println(iteratorInOrder.next());
        }
        System.out.println("iteratorPreOrder");
        Iterator<String> iteratorPreOrder = linkedBinaryTree.iteratorPreOrder();
        while (iteratorPreOrder.hasNext()){
            System.out.println(iteratorPreOrder.next());
        }
        System.out.println("iteratorPostOrder");
        Iterator<String> iteratorPostOrder = linkedBinaryTree.iteratorPostOrder();
        while (iteratorPostOrder.hasNext()){
            System.out.println(iteratorPostOrder.next());
        }
        System.out.println("iteratorLevelOrder");
        Iterator<String> iteratorLevelOrder = linkedBinaryTree.iteratorLevelOrder();
        while (iteratorLevelOrder.hasNext()){
            System.out.println(iteratorLevelOrder.next());
        }
    }
}
