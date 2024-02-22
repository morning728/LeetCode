package leetcode.march.AlgorithmI.sliding_window;

import leetcode.march.AlgorithmI.array_string_and_two_pointers.MajorityElement;

import java.util.Arrays;

public class MinimalSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println((new MinimalSizeSubarraySum.Solution()
                .minSubArrayLen(5, new int[]{2,3,1,1,1,1,1})));
    }

    static class Solution {

        public int minSubArrayLen(int target, int[] nums) {
            int res = 0, ress = Integer.MAX_VALUE, sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum+= nums[i];
                res++;
                while(true){
                    if(sum >= target) ress = Math.min(ress, res);
                    if(sum - nums[i - res + 1] >= target) {
                        sum -= nums[i - res + 1];
                        res--;
                    }
                    else {
                        break;
                    }
                }
            }
            return sum >= target ? Math.min(ress, res) : 0;
        }
    }
}
