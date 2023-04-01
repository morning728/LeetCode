package leetcode.march.AlgorithmI;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(new Solution().checkInclusion("abc", "cacb"));
    }
    static class Solution {
        public boolean checkInclusion(String s1, String s2) {
            Map<Character, Integer> map = new HashMap<>(); boolean fl = true;
            int left = 0;
            for(int i = 0; i < s1.length(); i++){
                map.compute(s1.charAt(i), (k, v) -> (v == null) ? 1 : v+1);
            }
            Map<Character, Integer> helper = new HashMap<>(map);
            while(left < s2.length() - s1.length() + 1){
                for(int i = 0; i < s1.length(); i++){
                    if(helper.containsKey(s2.charAt(left + i)) &&
                            helper.get(s2.charAt(left + i)) > 0){
                        helper.compute(s2.charAt(left + i), (k, v) -> v-1);
                    }
                    else{
                        helper.putAll(map);
                        break;
                    }
                }
                for (Integer j: helper.values()
                     ) {
                    if(j != 0){
                        fl = false;
                        break;
                    }
                }
                if(fl) return true;
                fl = true;
                left++;
            }
            return false;




















//            for(int i = 0; i < s1.length(); i++){
//                map.compute(s1.charAt(i), (k, v) -> (v == null) ? 1 : v+1);
//            }
//            Map<Character, Integer> helper = new HashMap<>(map);
//            for(int i = 0; i< s2.length(); i++){
//                if(helper.containsKey(s2.charAt(i)) &&
//                        helper.get(s2.charAt(i)) > 0){
//                    helper.compute(s2.charAt(i), (k, v) -> v-1);
//                }
//                else{
//                    helper.putAll(map);
//                }
//                for (Integer j: helper.values()
//                     ) {
//                    if(j != 0){
//                        fl = false;
//                        break;
//                    }
//                }
//                if(fl) return true;
//                fl = true;
//            }
//            return false;
        }
    }
}
