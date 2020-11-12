package List;

import Node.DoubleNode;

public class DoubleLinkUnorderedList<T> extends DoubleLinkedList<T>{

    public void addAtFront(T element){
        DoubleNode current = new DoubleNode(element);
        if (isEmpty()){
            head = current;
            tail = current;
            size++;
        }else {
            tail.setNext(current);
            current.setPrev(tail);
            this.tail = current;
            tail.setNext(null);
        }

    }
}
