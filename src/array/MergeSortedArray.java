package array;

import static java.util.Arrays.sort;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, j = m; i < n; i++) {
            nums1[j + i] = nums2[i];
        }
        sort(nums1);
    }
}
