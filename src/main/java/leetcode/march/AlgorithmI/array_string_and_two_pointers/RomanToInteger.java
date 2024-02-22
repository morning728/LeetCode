package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println((new RomanToInteger.Solution().romanToInt("LVIII")));
    }

    static class Solution {
        public Map<String, Integer> helper = Map.of("IV", 4, "IX", 9, "XL", 40, "XC", 90, "CD", 400, "CM", 900);
        public Map<String, Integer> helper2 = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000);
        public int romanToInt(String s) {
            int result = 0;int i = 0;
            while ( i < s.length() - 1) {

                String key = "" + s.charAt(i) + s.charAt(i + 1);
                if(helper.containsKey(key)){
                    result += helper.get(key);
                    i++;
                } else {
                    result += helper2.get("" + s.charAt(i));
                }
                i++;
            }
            if (i>s.length() - 1) return result;
            return result + helper2.get("" + s.charAt(s.length() - 1));
        }
    }
}
