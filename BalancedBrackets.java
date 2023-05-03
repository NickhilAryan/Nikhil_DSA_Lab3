import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "([{}])";
        String input2 = "([{}}]])";

        if (isBalanced(input1)) {
            System.out.println("The entered string has balanced brackets");
        } else {
            System.out.println("The entered string does not contain balanced brackets");
        }

        if (isBalanced(input2)) {
            System.out.println("The entered string has balanced brackets");
        } else {
            System.out.println("The entered string does not contain balanced brackets");
        }
    }
}
