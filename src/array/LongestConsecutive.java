package array;

import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {

        int[] nums = {1, 2, 0, 1};
        int cons = 1;
        int max = 1;
        nums = Arrays.stream(nums).sorted().distinct().toArray();
        Arrays.stream(nums).forEach(System.out::println);
        for (int i = 0; i < nums.length - 1; i++) {
            boolean isContinue = nums[i] + 1 == nums[i + 1];
            if (isContinue) {
                cons = cons + 1;
                System.out.println(nums[i] + 1 + " | " + nums[i + 1]);
            }
            if (i + 2 == nums.length || !isContinue) {
                if (cons > max) {
                    max = cons;
                }
                cons = 1;
            }
        }
        System.out.println(max);
    }
}
