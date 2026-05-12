import java.util.*;

public class ValidParentheses_20 {
    public static void main(String[] args) { //stack.isEmpty() inside loop — handles "]" case. Closing bracket arrives but no opening bracket in stack → invalid immediately!
        //stack.isEmpty() at end — handles "(((" case. Loop finishes but unmatched opening brackets remain → invalid!
        String s = "{{{";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) System.out.println(false);

                char top = stack.pop();

                if (c == ')' && top != '(' ||
                        c == '}' && top != '{' ||
                        c == ']' && top != '[') {

                    System.out.println(false);

                }
            }
        }
        System.out.println(stack.isEmpty());



    }
}
