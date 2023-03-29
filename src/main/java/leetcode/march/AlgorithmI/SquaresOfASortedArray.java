package leetcode.march.AlgorithmI;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int l = 0, r = nums.length - 1, i = 0;
            int[] res = new int[nums.length];
            while(l <= r) {
                if (Math.pow(nums[l], 2) > Math.pow(nums[r], 2)) {
                    res[res.length - 1 - i] = (int) Math.pow(nums[l], 2);
                    l += 1; i += 1;
                } else {
                    res[res.length - 1 - i] = (int) Math.pow(nums[r], 2);
                    r -= 1; i += 1;
                }
            }
            return res;
        }
    }
}
