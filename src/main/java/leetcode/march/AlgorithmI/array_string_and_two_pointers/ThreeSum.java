package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println((new ThreeSum.Solution().threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4})));
    }

    static class Solution {

        public List<List<Integer>> threeSum(int[] nums) {
            nums = Arrays.stream(nums).sorted().toArray();
            System.out.println(Arrays.toString(nums));
            List<List<Integer>> res = new ArrayList<>();
            /*for (int i = 0; i < nums.length; i++) {
                for (int j = nums.length - 1; j > i + 1; j--) {

                }
            }*/

            int left = 0, right = nums.length - 1;
            while(right > left + 1){
                int temp = nums[right] + nums[left], helper;
                if(temp < 0){
                    helper = right - 1;
                    while(temp + nums[helper] > 0 && helper != left) helper--;
                    if (helper > left &&
                            temp + nums[helper] == 0 &&
                            !res.contains(List.of(nums[left], nums[right], nums[helper]))) res.add(List.of(nums[left], nums[right], nums[helper]));
                    left++;
                } else if (temp > 0) {
                    helper = left + 1;
                    while(temp + nums[helper] < 0 && helper != right) helper++;
                    if (helper != right &&
                            temp + nums[helper] == 0 &&
                            !res.contains(List.of(nums[left], nums[right], nums[helper]))) res.add(List.of(nums[left], nums[right], nums[helper]));
                    right--;
                } else {
                    helper = left + 1;
                    while(temp + nums[helper] < 0 && helper != right) helper++;
                    if (helper != right &&
                            temp + nums[helper] == 0 &&
                            !res.contains(List.of(nums[left], nums[right], nums[helper]))) res.add(List.of(nums[left], nums[right], nums[helper]));

                    /////////////////
                    int t1 = left + 1, t2;
//                    while(nums[t1] == nums[left] && t1 < right - 1) t1++;
//                    if(t1 == right - 1) break
                    t2 = t1 + 1;
                    while(nums[t1] + nums[right] + nums[t2] <= 0 && t1 < right - 1){
                        while(nums[t1]+nums[right]+nums[t2]<0 && t2<right) t2++;
                        if(nums[t1]+nums[right]+nums[t2]==0 && t2!=right &&
                                !res.contains(List.of(nums[t1], nums[right], nums[t2]))) res.add(List.of(nums[t1], nums[right], nums[t2]));
                        t1++;t2 = t1+1;
                    }
                    /////////////////
                    right--;
                }
            }
            return res;
        }
    }
}
