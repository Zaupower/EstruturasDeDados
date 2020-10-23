
import java.io.IOException;

public class PostFixCalculator {

    private static final String ADD = "+";
    private static final String SUB = "-";
    private static final String MUL = "*";
    private static final String DIV = "/";
    private static final String POW = "^";

    public void calculateFile(String fileName) throws IOException {

        System.out.println(fileName + " = " + calculate(fileName));
    }

    private int calculate(String input) {
        SinglyLinkedListStack<Integer> stack = new SinglyLinkedListStack<>();

        String[] inputs = input.split(" ");

        return handleCalculation(stack, inputs);
    }

    private static int handleCalculation(SinglyLinkedListStack<Integer> stack, String[] el) {
        int operand1, operand2;

        for(int i = 0; i < el.length; i++) {
            if( el[i].equals(ADD) || el[i].equals(SUB) || el[i].equals(MUL) || el[i].equals(DIV) || el[i].equals(POW) ) {
                operand2 = stack.pop();
                operand1 = stack.pop();
                switch(el[i]) {
                    case ADD: {
                        int local = operand1 + operand2;
                        stack.push(local);
                        break;
                    }

                    case SUB: {
                        int local = operand1 - operand2;
                        stack.push(local);
                        break;
                    }

                    case MUL: {
                        int local = operand1 * operand2;
                        stack.push(local);
                        break;
                    }

                    case DIV: {
                        int local = operand1 / operand2;
                        stack.push(local);
                        break;
                    }


                    case POW: {
                        int local = (int) Math.pow(operand1, operand2);
                        stack.push(local);
                        break;
                    }
                }
            } else {
                stack.push(Integer.parseInt(el[i]));
            }
        }

        return stack.pop();
    }

}