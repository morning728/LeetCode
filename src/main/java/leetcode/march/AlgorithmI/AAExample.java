package leetcode.march.AlgorithmI;

import leetcode.march.AlgorithmI.array_string_and_two_pointers.MajorityElement;

import java.util.Arrays;

public class AAExample {
    public static void main(String[] args) {
        System.out.println((new AAExample.Solution().majorityElement(new int[]{3,3})));
    }

    static class Solution {

        public int majorityElement(int[] nums) {
            return(Arrays.stream(nums).sorted().toArray()[nums.length/2]);
        }
    }
}
