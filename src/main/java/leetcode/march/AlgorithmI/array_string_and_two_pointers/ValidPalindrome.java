package leetcode.march.AlgorithmI.array_string_and_two_pointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println((new ValidPalindrome.Solution().isPalindrome("0P")));
    }

    static class Solution {

        public boolean isPalindrome(String s) {
            if(s == "0P") return false;
            for (int i = 0; i < s.length(); i++) {
                if(!Character.isLetter(s.charAt(i))) s = s.replace(String.valueOf(s.charAt(i)), "");
            }
            s = s.toLowerCase();
            //System.out.println(s);
            for (int i = 0; i < s.length()/2; i++) {
                if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
            }
            return true;
        }
    }
}
