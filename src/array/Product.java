package array;

import java.util.Arrays;

public class Product {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        /*for (int i = 0; i < nums.length; i++) {
            int variable = nums[i];
            nums[1] = 1;
            nums[i] = Arrays.stream(nums)
                    .reduce((accumulator, n) -> accumulator * n)
                    .orElse(0);
            nums[i] = variable;
        }*/

        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
