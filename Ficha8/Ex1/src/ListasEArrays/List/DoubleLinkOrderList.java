package ListasEArrays.List;

import Ex1Carro.Car;
import ListasEArrays.Exceptions.EmptyCollectionException;
import ListasEArrays.Node.DoubleNode;

public class DoubleLinkOrderList<T>  extends DoubleLinkedList<T> implements OrderedListADT<T> , Comparable{


    @Override
    public void add(T element) throws EmptyCollectionException {
        if (element instanceof Comparable){
            DoubleNode current = new DoubleNode(element);
            if (head == null) {

                this.head = current;
                this.tail = current;
                this.size++;
            } else {
                boolean found = false;
                DoubleNode<T> Ncurrent = null;

                //Caso so exista um elemnto e o adicionado seja o segundo
                if (head.getNext() == null){
                    Comparable posAtrasF = (Comparable) head.getElement();

                    //Caso seja o segundo elemento e seja maior que a cabeca(head)
                    if (posAtrasF.compareTo(element) <= 0 ){
                        tail.setNext(current);
                        current.setPrev(tail);
                        this.tail = current;
                        tail.setNext(null);
                        //Caso seja menor do que a cabeca
                    }else {
                        DoubleNode<T> oldHead = head;
                        head = current;
                        current.setNext( oldHead);
                        oldHead.setPrev(head);
                    }

                    //tail.setNext(current);
                    this.size++;
                }else {
                    DoubleNode<T> currentIt = head;
                    while (found == false && currentIt != null){
                        Comparable<T> tmp = (Comparable<T>) currentIt.getElement();
                        if (tmp.compareTo(element) > 0 ){
                            found = true;

                        }else {
                            currentIt = currentIt.getNext();
                        }
                    }
                    if (found){
                        //adicionar antes da cabeca
                        if (currentIt.getPrev() == null){
                            DoubleNode<T> oldHead = head;
                            head = current;
                            current.setNext( oldHead);
                            oldHead.setPrev(head);

                            //Adicionar entre dois nodes
                        }else {
                            DoubleNode<T> previous =  currentIt.getPrev();
                            //prev set next current
                            previous.setNext(current);
                            //current set prev previous node
                            current.setPrev(previous);
                            //current set next next(currentIt)
                            current.setNext(currentIt);
                            //next(currentIt) set prev current
                            currentIt.setPrev(current);
                        }
                    }else {
                        //adicionar a seguir a cauda
                        tail.setNext(current);
                        current.setPrev(tail);
                        this.tail = current;
                        tail.setNext(null);
                    }

                }
                this.size++;
            }
        }else {
            System.out.println("Nao comparable");
        }
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}