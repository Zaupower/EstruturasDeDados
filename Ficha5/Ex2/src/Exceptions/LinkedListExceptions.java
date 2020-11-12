package Exceptions;

public class LinkedListExceptions extends Exception {

    public static final String EMPTYLIST ="Lista vazia.";
    public static final String NOTFOUND = "Não encontrado Node.";;

    public LinkedListExceptions() {
        super();
    }

    public LinkedListExceptions(String message) {
        super(message);
    }
}