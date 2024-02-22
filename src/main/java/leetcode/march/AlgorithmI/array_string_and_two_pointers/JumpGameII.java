package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.Arrays;

public class JumpGameII {
    public static void main(String[] args) {
        System.out.println((new JumpGameII.Solution().jump(new int[]{2,3,0,1,4})));
    }

    static class Solution {
        /*2,3,0,1,1,4*/
        int res = 0;
        public int jump(int[] nums) {
            if (nums.length < 2) return res;
            for(int i = 0; i < nums.length - 1; i++){
                if(nums.length - 1 - i - nums[i] <= 0) {res++; return jump(Arrays.copyOfRange(nums, 0, i + 1));}
            }
            return res;
            //return false;

            /*//for (int i = 0; i < nums.length; i++){
            if(nums.length - 1 - nums[0] <= 0) {return true;}
            else {
                for(int j = nums[0]; j >= 1; j--){
                    if(canJump(Arrays.copyOfRange(nums, j, nums.length))) return true;
                    else {
                        nums[j] = 0;
                    }
                }
            }
            //}
            return false;*/
        }
    }
}
