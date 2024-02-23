package twoPoints;

public class Palindrome {
    public static void main(String[] args) {
        String s = " ";

        char[] c = s.toLowerCase().toCharArray();
        StringBuilder input = new StringBuilder();

        for (Character ch : c) {
            if (ch >= 97 && ch <= 122 || ch >= 48 && ch <= 57) {
                input.append(ch);
            }
        }
        if (input.toString().equals(input.reverse().toString())) {
            System.out.println("true");
        }
        else if (input.toString().equals("")) {
            System.out.println("true");
        }

        System.out.println("false");
    }
}
