



public class main {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();


        //Demonstraçao para diferenciar classes com construtor diferentes
        //Duas classes com o mesmo construtor apontam para a mesma data e sao objectos do mesmo tipo
        //Com construtores diferentes apontam para a mesma data mas sao objectos diferentes que a conteem
        TwoTypePair twoTypePair = new TwoTypePair(t1, t2);
        TwoTypePair twoTypePair2 = new TwoTypePair();
        twoTypePair2.setSecond(t2);
        System.out.println(twoTypePair.toString());
        System.out.println(twoTypePair2.getSecond());
        System.out.println(twoTypePair.equals(twoTypePair2));
    }
}
