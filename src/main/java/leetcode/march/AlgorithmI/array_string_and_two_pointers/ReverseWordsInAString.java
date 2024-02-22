package leetcode.march.AlgorithmI.array_string_and_two_pointers;


import java.util.List;

public class ReverseWordsInAString {public static void main(String[] args) {
    System.out.println((new ReverseWordsInAString.Solution().reverseWords(" a good   example ")));
}

    static class Solution {

        public String reverseWords(String s) {
            String res = "";
            List<String> list = List.of(s.strip().split(" "));
            for(String str :list)
            {
                if(str.strip()!="") res = str.strip() + " " + res;
            }
            return res.strip();
        }
    }

}
