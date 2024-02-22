package leetcode.march.AlgorithmI.array_string_and_two_pointers;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println((new RemoveElement.Solution().removeElement(new int[]{3,3},3)));
    }

    static class Solution {

        public int removeElement(int[] nums, int val) {
            if(nums.length == 0) return 0;
            int first = 0, last = nums.length - 1, count = 0;
            while(first < last){
                if(nums[first] == val){
                    count++;
                    while(nums[last] == val && last > first){
                        count++;
                        last--;
                    }
                    if(last > first) {
                        nums[first] = nums[last];
                        last--;
                    } else {
                        return nums.length - count;
                    }
                }
                first++;
            }
            count = nums[first] == val ? count + 1 : count;

            return nums.length - count;

        }
    }
}
