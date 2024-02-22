package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import static java.lang.Math.abs;

public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println((new ZigZagConversion.Solution().convert("AB",2)));
    }

    static class Solution {

        public String convert(String s, int numRows) {
            int help = numRows > 1 ? numRows*2 - 2 : 1, help2 = 1;String res="";
            for (int j = numRows - 1; j >= 0; j--) {
                for(int i = 0; i < s.length(); i++){
                    if(abs(help2 - numRows) == j){
                        res+=s.charAt(i);
                    }
                    help2 = help2 == help ? 1 : help2 + 1;
                }
                help2 = 1;
            }
            return res;

        }
    }
}
