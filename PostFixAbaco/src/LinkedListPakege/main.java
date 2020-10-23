package LinkedListPakege;


public class main {

    public static void main(String[] args) throws LinkedListExceptions {
      //Simply node practice
        /**
        NodeTest x = new NodeTest(1,null);
        NodeTest y = new NodeTest(2,x);
        System.out.println(x.getData());
        System.out.println(y.getNext().getData());

         **/

        LinkedList<String> lista = new LinkedList<String>();

        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("3");
        String DeGetGrom = (String) lista.getFrom("3", 3);
        String DeStings= (String) lista.remove("3");
        System.out.println(DeGetGrom);
        //lista.remove("1");
        System.out.println(lista.toString());

        //lista.mostra();





    }
}
