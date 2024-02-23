package twoPoints;

public class ContainerWithWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;

        int result = 0;

        while (left < right) {
            int length = right - left;
            int waterArea = length * Math.min(height[left], height[right]);
            result = Math.max(result, waterArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

    }
}
