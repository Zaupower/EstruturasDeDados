package ListasEArrays.Exceptions;


public class EmptyCollectionException extends Exception {

    protected final static String EMPTYLIST = "Lista vazia.";
    protected final static String NOTFOUND = "Não encontrado Node.";

    public EmptyCollectionException(){
        super();
    }

    public EmptyCollectionException(String message){
        super(message);
    }
}