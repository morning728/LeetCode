package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.Arrays;

public class GasStation {
    public static void main(String[] args) {
        System.out.println((new GasStation.Solution().canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2})));
    }

    static class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            if(Arrays.stream(cost).sum() > Arrays.stream(gas).sum()) return -1;
            int[] helper = new int[cost.length];
            int min= 1,now = 0, entryPoint = -1;
            for (int i = 0; i < cost.length; i++) {
                now+=gas[i] - cost[i];
                if(now < min){
                    min = now;
                    entryPoint = i;
                }
            }
            return (entryPoint + 1) % (gas.length);
        }
    }
}
