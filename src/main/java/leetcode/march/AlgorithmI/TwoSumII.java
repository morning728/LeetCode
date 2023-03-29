package leetcode.march.AlgorithmI;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{-1,-1,1,1,1,1,1}, -2)));
    }

    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int i = numbers.length - 1, j = 0;
            while(numbers[i] + numbers[j] != target){
                if(numbers[i] + numbers[j] > target){
                    i -= 1;
                } else {
                    j++;
                }
            }
            return new int[]{++j, ++i};
        }
    }
}
