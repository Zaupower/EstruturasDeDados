

public class main {
    public static void main(String[] args) {
               //Demonstraçao para diferenciar classes com construtor diferentes
        //Duas classes com o mesmo construtor apontam para a mesma data e sao objectos do mesmo tipo
        //Com construtores diferentes apontam para a mesma data mas sao objectos diferentes que a conteem
        TwoTypePair<String,String> tmp = new TwoTypePair("Hello", "World");
        TwoTypePair<String,String> tmp1 = new TwoTypePair("Hellos", "World");
        System.out.println(tmp.equals(tmp1));
    }
}
