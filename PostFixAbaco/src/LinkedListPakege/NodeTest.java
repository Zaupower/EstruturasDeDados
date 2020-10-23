package LinkedListPakege;

public class NodeTest<T> {

    private T data;
    private NodeTest<T> next;


    public NodeTest(T d, NodeTest<T> nx){
        this.data = d;
        this.next = nx;
    }
    public NodeTest(){

    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeTest getNext() {
        return next;
    }

    public void setNext(NodeTest<T> next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
