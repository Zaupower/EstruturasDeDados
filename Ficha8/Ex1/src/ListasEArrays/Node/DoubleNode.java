package ListasEArrays.Node;

public class DoubleNode<T>
{
    private DoubleNode<T> next;
    private DoubleNode<T> prev;
    private T element;
    //Implementacao de prev como previus ou anterior para registrar o elemnto anterior

    //---------------------------------------------------------
    //  Creates an empty node.
    //---------------------------------------------------------
    public DoubleNode()
    {
        this.next = null;
        this.prev = null;
        this.element = null;
    }

    //---------------------------------------------------------
    //  Creates a node storing the specified element.
    //---------------------------------------------------------
    public DoubleNode(T elem)
    {
        this.prev = null;
        this.next = null;
        this.element = elem;
    }

    //---------------------------------------------------------
    //  Returns the node that follows this one.
    //---------------------------------------------------------
    public DoubleNode<T> getNext()
    {
        return this.next;
    }

    //---------------------------------------------------------
    //  Sets the node that follows this one.
    //---------------------------------------------------------
    public void setNext (DoubleNode<T> node)
    {
        this.next = node;
    }

    //---------------------------------------------------------
    //  Returns the element stored in this node.
    //---------------------------------------------------------
    public T getElement()
    {
        return this.element;
    }

    //---------------------------------------------------------
    //  Sets the element stored in this node.
    //---------------------------------------------------------
    public void setElement (T elem)
    {
        this.element = elem;
    }

    public void setPrev(DoubleNode<T> node) {

        this.prev = node;
    }

    public DoubleNode<T> getPrev() {
        return this.prev;
    }

    @Override
    public String toString() {
        if (this.prev == null){
            return "Node{" +

                    "data=" + this.element+
                    ", next=" + this.next +
                    '}';
        }else if (this.next != null){
            return "Node{" +

                    "data=" + this.element+
                    ", prev=" + this.prev.element +
                    '}';

        }else {
        return "Node{" +

                "data=" + this.element+
                ", prev=" + this.prev.element +
                ", next=" + this.next +
                '}';
        }
    }
}