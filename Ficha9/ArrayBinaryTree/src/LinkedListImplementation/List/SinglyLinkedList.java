package LinkedListImplementation.List;

import LinkedListImplementation.Node.LinearNode;

public class SinglyLinkedList<T> {

    private int size;
    private LinearNode<T> head;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public void push(T element) {
        if(head == null) {
            head = new LinearNode<T>(element);
        } else {
            LinearNode<T> newNode = new LinearNode<T>(element);
            newNode.setNext(head);
            head = newNode;
        }

        size++;
    }

    public T pop() {
        if(head == null)
            return null;
        else {
            T topData = head.getElement();

            head = head.getNext();
            size--;

            return topData;
        }
    }

    public T top() {
        if(head != null)
            return head.getElement();
        else
            return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size>0){
            return false;
        }else {
            return true;
        }
    }

    public boolean asNext(LinearNode<T> element){
        if (element.getNext() != null){
            return true;
        }else
            return false;
    }
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

    }
    public T recursiveGetLast(){
        if (!asNext(head)){
            return head.getElement();
        }
        head = head.getNext();
        recursiveGetLast();
        return head.getElement();
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "size=" + size +
                ", head=" + head +
                '}';
    }
}