import java.util.Stack;

/**
 * BracketBalance
 */
public class BracketBalance {

    public static void main(String[] args) {
        String input1 = "{ [ ( ) ] }";
        String input2 = "{ [ ( ] ) }";
        String input3 = "{ ( ( [ ] ) [ ] ) [ ] }";
        
        System.out.println("Sample 1: " + checkBalance(input1));
        System.out.println("Sample 2: " + checkBalance(input2));
        System.out.println("Sample 3: " + checkBalance(input3));
    }

    public static String checkBalance(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char top = stack.pop();
                if ((c == '}' && top != '{') ||
                    (c == ']' && top != '[') ||
                    (c == ')' && top != '(')) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}