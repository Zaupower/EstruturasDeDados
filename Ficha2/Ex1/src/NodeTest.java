public class NodeTest {

    private int data;
    private NodeTest next;


    public NodeTest(int d, NodeTest nx){
        this.data = d;
        this.next = nx;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeTest getNext() {
        return next;
    }

    public void setNext(NodeTest next) {
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
