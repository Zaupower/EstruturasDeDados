package List;
import Node.LinearNode;
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
        return size == 0;
    }

    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

    }

}
