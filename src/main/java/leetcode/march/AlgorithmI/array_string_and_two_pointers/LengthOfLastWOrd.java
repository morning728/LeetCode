package leetcode.march.AlgorithmI.array_string_and_two_pointers;

public class LengthOfLastWOrd {
    public static void main(String[] args) {
        System.out.println((new LengthOfLastWOrd.Solution().lengthOfLastWord("df s ")));
    }

    static class Solution {

        public int lengthOfLastWord(String s) {
            return s.split(" ")[s.split(" ").length - 1].length();
        }
    }
}
