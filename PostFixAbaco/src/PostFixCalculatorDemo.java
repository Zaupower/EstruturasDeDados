import java.io.IOException;

public class PostFixCalculatorDemo {
    public static void main(String[] args) throws IOException {

        PostFixCalculator calc = new PostFixCalculator();
        calc.calculateFile("in.txt");
    }
}