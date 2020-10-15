import org.w3c.dom.Node;



public class main {

    public static void main(String[] args) throws LinkedListExceptions {
      //Simply node practice
        /**
        NodeTest x = new NodeTest(1,null);
        NodeTest y = new NodeTest(2,x);
        System.out.println(x.getData());
        System.out.println(y.getNext().getData());

         **/

        LinkedList lista = new LinkedList();

        lista.add(1);
        lista.mostra();
        System.out.println("DEposi");
        lista.add(2);
        lista.mostra();
        lista.remove(1);
        lista.mostra();





    }
}
