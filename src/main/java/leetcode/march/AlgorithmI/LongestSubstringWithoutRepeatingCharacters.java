package leetcode.march.AlgorithmI;

import java.util.HashSet;
import java.util.Set;


public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("bbbbw"));
    }
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> set=new HashSet<>();
            int maxLength=0;
            int left=0;
            for(int right=0;right<s.length();right++){

                if(!set.contains(s.charAt(right))){
                    set.add(s.charAt(right));

                }else{
                    maxLength=Math.max(maxLength,right-left);
                    while(s.charAt(left)!=s.charAt(right)){
                        set.remove(s.charAt(left));
                        left++;
                    }
                    set.remove(s.charAt(left));left++;
                    set.add(s.charAt(right));
                }

            }
            return Math.max(maxLength,s.length()-left);
        }
    }
}
