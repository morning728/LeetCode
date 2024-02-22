package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.Arrays;

public class RemoveDublicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println((new RemoveDublicatesFromSortedArray.Solution().removeDuplicates(new int[]{1,1,2})));
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            if(nums.length < 2) return nums.length;
            else if (nums.length == 2) {
                return nums[0] == nums[1] ? 1 : 2;
            }
            int first = 0, second = 1, counter = 1;
            while(true){
                while(second < nums.length && nums[first] == nums[second]){
                    second++;
                }
                if(second >= nums.length){
                    System.out.println(Arrays.toString(nums)); return counter;}
                nums[++first] = nums[second];
                counter++;
            }
        }
    }
}
