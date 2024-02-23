package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

    List<String> result = new ArrayList<>();
    Stack<Character> stack = new Stack<>();

    private void permPrefix(int openLength, int closedLength, int length) {
        if (openLength == closedLength && closedLength == length) {
            String one = "";
            for (Character character : stack) {
                one = one + character;
            }
            result.add(one);
        }
        if (openLength < length) {
            stack.push('(');
            permPrefix(openLength + 1, closedLength, length);
            stack.pop();
        }
        if (closedLength < openLength) {
            stack.push(')');
            permPrefix(openLength, closedLength + 1, length);
            stack.pop();
        }
    }

    public List<String> perm(int s) {
        permPrefix(0 ,0 , s);
        return result;
    }


    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        System.out.println(generateParentheses.perm(3));
    }
}
