package leetcode.march.AlgorithmI.array_string_and_two_pointers;

public class IsSubSeq {
    public static void main(String[] args) {
        System.out.println((new IsSubSeq.Solution().isSubsequence("df","df")));
    }

    static class Solution {

        public boolean isSubsequence(String s, String t) {
            if(s.isEmpty()) return true;
            int helper = 0;
            for (int i = 0; i < t.length(); i++) {
                if(t.charAt(i)==s.charAt(helper)) helper++;
                if (helper == s.length()) return true;
             }
            return false;
        }
    }
}
