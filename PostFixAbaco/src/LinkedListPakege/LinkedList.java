package LinkedListPakege;

public class LinkedList<T> {

    private NodeTest<T> head, tail;

    private long size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean add(T data) {

        NodeTest current = new NodeTest(data, null);
        if (head == null) {

            this.head = current;
            this.tail = current;
            this.size++;
            return true;
        } else {
            NodeTest last = tail;
            // Insert the new_node at last node
            last.setNext(current);
            this.tail = current;
            this.size++;
            return true;
        }
    }

    public Object getFrom(T data, int position) throws LinkedListExceptions {
        NodeTest<T> tmp = new NodeTest<>();
        if (this.head == null) {throw new LinkedListExceptions(LinkedListExceptions.EMPTYLIST);
        } else {
            NodeTest<T> current = head;
            NodeTest<T> previous = null;

            boolean found = false;
            while (current != null && found == false) {
                if (current.getData().equals(data)) {
                    found = true;
                } else {
                    previous = current;
                    current = current.getNext();
                }
            }
            if (current.getData() == (head.getData())) {

                //
                tmp = (NodeTest<T>) current.getData();

            }


            }
        return tmp.getData();

    }
        public Object remove (T data) throws LinkedListExceptions {

            NodeTest<T> tmp = head;

            if (this.head == null) {

                throw new LinkedListExceptions(LinkedListExceptions.EMPTYLIST);
            } else {
                NodeTest<T> current1 = head;
                NodeTest<T> previous1 = null;

                boolean found1 = false;
                while (current1 != null && found1 == false) {
                    if (current1.getData().equals(data)) {
                        found1 = true;
                    } else {
                        previous1 = current1;
                        current1 = current1.getNext();
                    }
                }

                if (found1 == true) {
                    //Caso so exista um elemento ou node
                    if (this.size == 1) {
                        this.head = null;
                        this.tail = null;
                        //Caso o que se pretenda se encontre no head node
                    } else if (current1.getData() == (head.getData())) {
                        //NodeTest<T> currentHead = current;
                        head = head.getNext();
                        current1.setNext(null);
                        //Caso se encontre na tail
                    } else if (current1.getData() == (tail.getData())) {
                        previous1.setNext(null);
                        tail = previous1;
                        //Caso esteja no meio o anterior aponta para o seguinte do removido e o removido para null
                    } else {
                        previous1.setNext(current1.getNext());
                        current1.setNext(null);
                    }
                    this.size--;
                    return current1.getData();
                } else {
                    throw new LinkedListExceptions(LinkedListExceptions.NOTFOUND);
                }
            }
        }
        public long getSize () {
            return size;
        }

        public String toString () {

            return "LinkedList{" +
                    "head=" + head +
                    ", tail=" + tail +
                    ", size=" + size +
                    '}';
        }
    }
