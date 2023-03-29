package leetcode.march.AlgorithmI;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        new Solution().reverseString(new char[]{'h', ' ','d',' ',' ',' ', 'l'});
    }
    static class Solution {
        public void reverseString(char[] s){
            char[] s2 = new char[s.length];
            for( int i = s.length - 1; i > - 1; i--){
                s2[s2.length - 1 - i] = s[i];
            }
            System.arraycopy(s2, 0, s, 0, s.length);
        }
    }
}
