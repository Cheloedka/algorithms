public class Fibo {

    public static int fibo(int id) {
        if (id == 1 || id == 2) {
            return 1;
        }

        return fibo(id - 1) + fibo(id - 2);
    }

    public static int fibo2(int id) {

        if (id == 1 || id == 2) {
            return 1;
        }
        int prev1 = 1;
        int prev2 = 1;
        int now = 0;
        for (int i = 3; i < id; i++) {
            now = prev1 + prev2;
            prev2 = prev1;
            prev1 = now;
        }
        return now;
    }


    public static void main(String[] args) {

        // 1, 1, 2, 3, 5, 8, 13

        System.out.println(fibo2(9));

    }
}
