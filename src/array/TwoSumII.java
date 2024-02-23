package array;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int a_point = 0;
        int b_point = numbers.length - 1;

        int num_a, num_b;

        while (a_point > b_point) {
            num_a = numbers[a_point];
            num_b = numbers[b_point];

            if (num_a + num_b == target) break;

            if (num_a + num_b < target) {
                a_point++;
                continue;
            }

            b_point--;

        }

       // return new int[] { a_point + 1, b_point + 1 };
    }
}
