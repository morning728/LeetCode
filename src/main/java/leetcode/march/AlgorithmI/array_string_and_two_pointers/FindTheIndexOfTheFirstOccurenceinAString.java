package leetcode.march.AlgorithmI.array_string_and_two_pointers;

public class FindTheIndexOfTheFirstOccurenceinAString {
    public static void main(String[] args) {
        System.out.println((new FindTheIndexOfTheFirstOccurenceinAString.Solution().strStr("sadbutsad", "fad")));
    }

    static class Solution {

        public int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
        }
    }
}
