package leetcode.march.AlgorithmI;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        new Solution().rotate(new int[]{1,2,3, 4, 5, 6, 7}, 1);
    }
    static class Solution {
        public void rotate(int[] nums, int k) {
            int i = (nums.length - k) % nums.length >= 0 ? (nums.length - k) % nums.length : (nums.length - Math.abs((nums.length - k) % nums.length)) % nums.length; int[] res = new int[nums.length];
            for(int j = 0; j < nums.length; j++){
                res[j] = nums[i % nums.length];
                i++;
            }
            System.arraycopy(res, 0, nums, 0, nums.length);
            System.out.println(Arrays.toString(nums));
        }
    }
}
