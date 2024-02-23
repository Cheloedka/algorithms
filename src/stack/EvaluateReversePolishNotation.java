package stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+"))
                stack.add(stack.pop() + stack.pop());
            else if (token.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b - a);
            }
            else if (token.equals("*"))
                stack.add(stack.pop() * stack.pop());
            else if (token.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b / a);
            }
            else
                stack.add(Integer.parseInt(token));
        }
        System.out.println(stack.pop());
        //return stack.pop();
    }
}
