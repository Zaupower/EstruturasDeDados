
import java.util.Stack;

public class PracticeInfixToPrefix {
    private static String exp;
    public String getPrefix;

    public PracticeInfixToPrefix() {
    }

    // A utility function to return precedence of a given operator
    // Higher returned value means higher precedence
    public static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }


    public  static String infixToPostfix(String exp){
        String result = new String("");

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
                result += c;

            else if (c == '(')
                stack.push(c);

            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression";
                else
                    stack.pop();
            }
            else
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){
                    if(stack.peek() == '(')
                        return "Invalid Expression";
                    result += stack.pop();
                }
                stack.push(c);
            }

        }
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

    public String getPrefix(String infix) {
        String postFix = infixToPostfix(infix);
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < postFix.length(); i++)
        {
            result = result.append(postFix.charAt(i));
            if(i == postFix.length()-1)
                break;
            result = result.append(' ');
        }
        return (result.toString());
    }
}
