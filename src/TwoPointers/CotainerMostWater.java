package TwoPointers;

public class CotainerMostWater {
    public static int maxArea(int[] height) {
        int area;
        int maxArea = Integer.MIN_VALUE;
        int width;
        int left = 0, right = height.length - 1;
        while (left < right) {
            width = right - left;
            area = Math.min(height[left], height[right]) * width;

            if (height[left] <= height[right]) {
                left++;
            }
            else {
                right--;
            }
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
