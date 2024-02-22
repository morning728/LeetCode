package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.Arrays;

import static java.lang.Math.min;

public class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().merge(new int[]{0},0,new int[]{1},1)));
    }

    static class Solution {
        public int[] merge(int[] nums1, int m, int[] nums2, int n) {
            int[] result = new int[m + n];
            int i = 0, j = 0;
            while(i < m && j < n){
                if(nums1[i] < nums2[j]) {
                    result[i + j] = nums1[i++];
                } else {
                    result[i + j] = nums2[j++];
                }
            }
            while (i < m){
                result[j + i] = nums1[i++];
            }
            while (j < n){
                result[j + i] = nums2[j++];
            }
            nums1 = result;
            return nums1;
        }
    }
}
