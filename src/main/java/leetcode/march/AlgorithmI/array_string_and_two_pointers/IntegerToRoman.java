package leetcode.march.AlgorithmI.array_string_and_two_pointers;

import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println((new IntegerToRoman.Solution().intToRoman(400)));
    }

    static class Solution {
        public Map<Integer, String> helper = Map.of(4, "IV",
                9,"IX",
                40,"XL",
                90, "XC",
                400,"CD",
                900,"CM");
        public Map<Integer, String> helper2 = Map.of(1, "I",
                5, "V",
                10,"X",
                50,"L",
                100,"C",
                500,"D",
                1000,"M");
        public String intToRoman(int num) {
            String result = "";//1994 MCMXCIV

            result += helper2.get(1000).repeat(num/1000);
            num%=1000;
            if(num%1000>=900) {
                result += helper.get(900);
                num%=100;
            } else {
                result+= helper2.get(500).repeat(num/500);
                num%=500;
                result+=num>=400?helper.get(400) : helper2.get(100).repeat(num/100);
                num%=100;
            }

            if(num%100>=90) {
                result += helper.get(90);
                num%=10;
            } else if(num%100>=50){
                result+= helper2.get(50).repeat(num/50);
                num%=50;
                result+= helper2.get(10).repeat(num/10);
                num%=10;
            }
            else if(num%100>=40) {
                result += helper.get(40);
                num%=10;
            } else {
                result+= helper2.get(10).repeat(num/10);
                num%=10;
            }
            if(num%10>=9) {
                result += helper.get(9);
            } else {
                result+= helper2.get(5).repeat(num/5);
                num%=5;
                result+= num ==4 ? helper.get(4) : helper2.get(1).repeat(num);
            }

            return result;
        }
    }
}
