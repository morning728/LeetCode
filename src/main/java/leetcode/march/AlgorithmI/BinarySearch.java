package leetcode.march.AlgorithmI;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{1,2, 3,5}, 4));
    }

    static class Solution {

        public int search(int[] nums, int target) {
            int l = 0, r = nums.length - 1, mid;
            while(l <= r){
                mid = (l + r)/2;
                if(target == nums[mid])
                    return mid;
                else if (target > nums[mid]) {
                    l = mid + 1;
                }
                else if (target < nums[mid]){
                    r = mid - 1;
                }
            }
            return l;
        }
    }
}
