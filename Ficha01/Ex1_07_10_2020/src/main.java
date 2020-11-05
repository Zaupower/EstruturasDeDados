import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        UnorderedPair<String> p1 =
                new UnorderedPair<String>("peanuts", "peanuts");
        UnorderedPair<String> p2 =
                new UnorderedPair<String>("beer", "peanuts");
        if (p1.equals(p2)) {
            System.out.println(p1.getFirst() + " and "
                    + p1.getSecond() + " is the same as");
            System.out.println(p2.getFirst() + " and "
                    + p2.getSecond());
        }
        System.out.println(p2.getFirst());
        System.out.println(p1.getEquals());
    }
}
