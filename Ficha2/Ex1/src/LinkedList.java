public class LinkedList<T>{

    private NodeTest<T> head, tail;

    private long size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean add(T data){

        NodeTest current = new NodeTest(data, null);
        if (head == null){

            this.head = current;
            this.tail = current;
            this.size++;
            return true;
        }else {
            NodeTest last = tail;
            // Insert the new_node at last node
            last.setNext(current);
            this.tail = current;
            this.size++;
            return true;
        }
    }

    public Object remove(T data) throws LinkedListExceptions {
        if(this.head == null){
            throw new LinkedListExceptions(LinkedListExceptions.EMPTYLIST);
        }
        else{
            NodeTest<T> current = head;
            NodeTest<T> previous = null;

            boolean found = false;
            while(current!=null && found == false){
                if(current.getData().equals(data)){
                    found = true;
                }else{
                    previous = current;
                    current = current.getNext();
                }
            }

            if(found == true){
                //Caso so exista um elemento ou node
                if(this.size == 1){
                    this.head = null;
                    this.tail = null;
                //Caso o que se pretenda se encontre no head node
                }else if(current.getData()==(head.getData())){
                    //NodeTest<T> currentHead = current;
                    head = head.getNext();
                    current.setNext(null);
                    /**
                    head = head.getNext();
                     currentHead.setNext(null);**/
                //Caso se encontre na tail
                }else if(current.getData()==(tail.getData())){
                    previous.setNext(null);
                    tail = previous;
                //Caso esteja no meio o anterior aponta para o seguinte do removido e o removido para null
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
        NodeTest<T> current = head;
        while(current!=null){
            System.out.println(current.toString());
            current= current.getNext();
        }
    }
}
