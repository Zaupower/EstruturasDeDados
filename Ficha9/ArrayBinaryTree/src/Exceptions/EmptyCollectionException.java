package Exceptions;

public class EmptyCollectionException extends Exception {
    public  EmptyCollectionException(){
        super();
    }
    public  EmptyCollectionException(String msg){
        super(msg);
    }
}
