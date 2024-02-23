import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzz {

    public static Map<Integer, String> numbers = new HashMap<>();

    public static List<String> fizzBuzz(int n) {

        numbers.put(3, "Fizz");
        numbers.put(5, "Buzz");
        numbers.put(7, "Jazz");


        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String answer = "";

            for (Integer j : numbers.keySet()) {
                if (i % j == 0) {
                    answer += numbers.get(j);
                }
            }

            if (answer.equals("")) {
                result.add(Integer.toString(i));
            }
            else {
                result.add(answer);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 40;
        List<String> result = fizzBuzz(n);

        for (String s : result) {
            System.out.println(s + " ");
        }

    }
}
