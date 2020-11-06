package Exceptions;

public class ElementNotFoundException extends Throwable {

    protected final static String NOTFOUND = "Não encontrado Node.";

    public  ElementNotFoundException(){
        super();
    }

    public ElementNotFoundException(String message){
        super();
    }
}
