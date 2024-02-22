package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.Arrays;

import static java.lang.Math.max;

public class HIndex {
    public static void main(String[] args) {
        System.out.println((new HIndex.Solution().hIndex(new int[]{4,4,0,0})));
    }

    static class Solution {

        public int hIndex(int[] citations) {
            citations = Arrays.stream(citations).sorted().toArray();
            int result = citations.length, helper = 0;
            for(int i = citations.length - 1; i >= 0; i--){
                if(citations[i] < result) result = max(citations[i], helper);
                if (++helper >= result) return result;
            }
            return 0;
        }
    }
}
