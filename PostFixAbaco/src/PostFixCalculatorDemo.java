import java.io.IOException;
import java.util.Scanner;

public class PostFixCalculatorDemo {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        PostFixCalculator calc = new PostFixCalculator();
        InfixToPrefix infixToPrefix = new InfixToPrefix();
        String prefix =  infixToPrefix.getPrefix(inputString);
        System.out.println("Prefix result: "+prefix);
        calc.calculateFile(prefix);
    }
}