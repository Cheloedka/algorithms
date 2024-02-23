package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] nums2 = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        nums2 = map.keySet().stream()
                .sorted((a, b) -> map.get(b) - map.get(a))
                .limit(k)
                .mapToInt(i -> i).toArray();

        System.out.println(nums2);
    }
}
