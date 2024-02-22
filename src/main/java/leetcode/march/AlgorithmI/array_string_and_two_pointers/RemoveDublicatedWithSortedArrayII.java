package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.Arrays;

public class RemoveDublicatedWithSortedArrayII {
    public static void main(String[] args) {
        System.out.println((new RemoveDublicatedWithSortedArrayII.Solution().removeDuplicates(new int[]{1,1,1,2,2,3})));
    }

    static class Solution {


        public int removeDuplicates(int[] nums) {

            if(nums.length < 3) return nums.length;
            int first = 0, second = 1;boolean /*fl =  nums[nums.length - 2] == nums[nums.length - 1] ? true : false,*/
                    fl2 = nums[first] == nums[first+1] ? false : true;//counter = 1;
            while(true){
                while(second < nums.length && nums[first] == nums[second]){
                    second++;
                }
                if(second >= nums.length){
                    if(!fl2){
                        //counter++;
                        nums[++first] = nums[first - 1];
                    }
                    System.out.println(Arrays.toString(nums));
                    return ++first;}
                if(!fl2){
                    nums[first+1] = nums[first];
                    first += 2;
                    //counter += 2;
                }
                else {
                    first++;
                    //counter++;
                }
                nums[first] = nums[second];
                if(second+1 < nums.length && nums[second + 1] == nums[second]) fl2 = false;
                else fl2 = true;
            }
        }
    }
}
