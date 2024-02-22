package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println((new MajorityElement.Solution().majorityElement(new int[]{3,3})));
    }

    static class Solution {

        public int majorityElement(int[] nums) {
            return(Arrays.stream(nums).sorted().toArray()[nums.length/2]);
        }
    }
}
