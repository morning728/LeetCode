package leetcode.march.AlgorithmI;

import java.util.Arrays;
import java.util.List;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        new ReverseString.Solution().reverseString(new char[]{'h', ' ','d',' ',' ',' ', 'l'});
    }
    static class Solution {
        public String reverseWords(String s) {
            String[] list = s.split(" ");
            s = ""; StringBuilder sb = new StringBuilder();
            StringBuilder sBuilder = new StringBuilder(s);
            for (int i = 0; i < list.length - 1; i ++) {
                sBuilder.append(sb.append(list[i]).reverse()).append(" ");
                sb.delete(0, sb.length());
            }
            sBuilder.append(sb.append(list[list.length - 1]).reverse());
            return sBuilder.toString();
        }
    }
}
