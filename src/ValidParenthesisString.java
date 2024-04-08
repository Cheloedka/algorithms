import java.util.Stack;

public class ValidParenthesisString {

    public static boolean checkValidString(String s) {

        int left = 0, right = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left = left + 1;
                right = right + 1;
            }
            else if (s.charAt(i) == ')') {
                left = left - 1;
                right = right - 1;
            }
            else {
                left = left - 1;
                right = right + 1;
            }
            if (right < 0) {
                return false;
            }
            if (left < 0) {
                left = 0;
            }
        }
        return left == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkValidString("()"));
        System.out.println(checkValidString("(*)"));
        System.out.println(checkValidString("(*))"));
        System.out.println(checkValidString("())"));
    }
}
