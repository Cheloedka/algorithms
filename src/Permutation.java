public class Permutation {

   /* public static String perm(String st) {
        String per = "";

        if (st.length() == 1) {
           return st;
        }
        for (int i = 0; i < st.length(); i++) {
            per = st.charAt(i) + perm(st);
        }
    }*/

    private static void permPrefix(String prefix, String s) {
        int len = s.length();
        if (len == 1) {
            System.out.println(prefix + s);
        }
        else {
            for (int i = 0; i < len; i++) {
                permPrefix(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1));
            }
        }
    }

    public static void perm(String s) {
        permPrefix("", s);
    }


    public static void main(String[] args) {
        perm("ABC");
    }

}
