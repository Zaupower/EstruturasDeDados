import java.io.IOException;
import java.util.Scanner;

public class PostFixCalculatorDemo {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        PostFixCalculator calc = new PostFixCalculator();
        PracticeInfixToPrefix practiceInfixToPrefix = new PracticeInfixToPrefix();
        String infix = inputString;
        System.out.println("Infix: "+infix);
        String prefix =  practiceInfixToPrefix.getPrefix(infix);
        System.out.println("Prefix result: "+prefix);
        calc.calculateFile(prefix);
    }
}