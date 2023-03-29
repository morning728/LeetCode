package leetcode.march.AlgorithmI;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        new Solution().moveZeroes(new int[]{0, 2, 3, 1,0,0, 4,5});
    }
    static class Solution {
        public void moveZeroes(int[] nums) {
            int i = 0, j;

            while(i < nums.length){
                if(nums[i] == 0) {
                    j = 0;
                    while (i + j < nums.length && nums[i + j] == 0){
                        j++;
                    }
                    if( i + j >= nums.length) break;
                    nums[i] = nums[i + j];
                    nums[i+j] = 0;

                }


                i += 1;
            }

//            for(i = nums.length - counter;  i < nums.length; i++){
//                nums[i] = 0;
//            }

            System.out.println(Arrays.toString(nums));
        }
    }
}
