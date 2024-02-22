package leetcode.march.AlgorithmI.array_string_and_two_pointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println((new ContainerWithMostWater.Solution().maxArea(new int[]{1,1})));
    }

    static class Solution {

        public int maxArea(int[] height) {
            int res = 0;
            for (int i = 0; i < height.length; i++) {
                for (int j = height.length - 1; j > i; j--) {
                    if(height[j] >= height[i]){
                        res = Math.max(res, height[i]*(j - i));
                        break;
                    }
                    res = Math.max(res, height[j]*(j - i));
                }
            }
            return res;
        }
    }
}
