package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println((new LongestCommonPrefix.Solution().longestCommonPrefix(new String[]{"d", "doh","a"})));
    }

    static class Solution {

        public String longestCommonPrefix(String[] strs) {
            if(strs.length < 1) return "";
            else if(strs.length < 2) return strs[0];
            String result = strs[0]; int i = 1;
            while(true){
                String temp = i<=result.length()-1 ? result.substring(0,i): result;
                if(i>result.length()-1) return Arrays.stream(strs).filter(str -> str.startsWith(result)).count() == strs.length ? result : result.substring(0,i-1);
                else if (Arrays.stream(strs).filter(str -> str.startsWith(temp)).count() < strs.length) {
                    return result.substring(0,i-1);
                }
                else i++;

            }
        }
    }
}
