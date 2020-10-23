public class main {


    public static void main(String[] args) {

        Stack<Integer> stackNumeros = new Stack<Integer>();

        stackNumeros.push(1);
        stackNumeros.push(2);
        stackNumeros.push(3);
        stackNumeros.push(4);
        stackNumeros.push(5);
        stackNumeros.push(1);
        stackNumeros.push(2);
        stackNumeros.push(3);
        stackNumeros.push(4);
        stackNumeros.push(5);
        //stackNumeros.pop();
        //stackNumeros.show();
        System.out.println("peek "+ stackNumeros.peek());
        stackNumeros.peek();
        //stackNumeros.show();
        stackNumeros.toString();
        System.out.println(stackNumeros.size());

    }
}
