public class LinkedList{

    private NodeTest head, tail;

    private long size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean add(int data){

        NodeTest current = new NodeTest(data, null);
        if (head == null){

            this.head = current;
            this.tail = current;
            this.size++;
            return true;
        }else {

            NodeTest last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            // Insert the new_node at last node
            last.setNext(current);
            this.size++;
            return true;
        }
    }

    public int remove(int data) throws LinkedListExceptions {
        if(this.head == null){
            throw new LinkedListExceptions(LinkedListExceptions.EMPTYLIST);
        }
        else{
            NodeTest current = head;
            NodeTest previous = null;

            boolean found = false;
            while(current!=null && found == false){
                if(current.getData() == (data)){
                    found = true;
                }else{
                    previous = current;
                    current = current.getNext();
                }
            }

            if(found == true){
                if(this.size == 1){
                    this.head = null;
                    this.tail = null;
                }else if(current.getData()==(head.getData())){
                    NodeTest currentHead = current;
                    head = head.getNext();
                    currentHead.setNext(null);
                }else if(current.getData()==(tail.getData())){
                    previous.setNext(null);
                    tail = previous;
                }else {
                    previous.setNext(current.getNext());
                    current.setNext(null);
                }
                this.size--;
                return current.getData();
            }else {
                throw new LinkedListExceptions(LinkedListExceptions.NOTFOUND);
            }
        }
    }

    public void mostra(){
        NodeTest current = head;
        while(current!=null){
            System.out.println(current.toString());
            current= current.getNext();
        }
    }
}
