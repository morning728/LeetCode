package leetcode.march.AlgorithmI;

public class StoneGame {
    public static void main(String[] args) {
        System.out.println(new Solution().stoneGame(new int[]{7,8,8,10}));
    }

    public static class Solution  {
        public boolean stoneGame(int[] piles) {
            int Alice = 0, Bob = 0, i = 0, j = piles.length - 1;
            while(j > i){
                if(piles[i] > piles[j]){
                    Alice += piles[i];
                    i++;
                }
                else if (piles[i] < piles[j]){
                    Alice += piles[j];
                    j--;
                }
                else{
                    if( i == j){
                        Alice += piles[j];
                        j--;
                    }
                    else if(piles[i + 1] > piles[j - 1]){
                        Alice += piles[j];
                        j--;
                    }
                    else{
                        Alice += piles[i];
                        i++;
                    }
                }
                if(piles[i] > piles[j]){
                    Bob += piles[i];
                    i++;
                }
                else if (piles[i] < piles[j]){
                    Bob += piles[j];
                    j--;
                }
                else{
                    if( i == j){
                        Bob += piles[j];
                        j--;
                    }
                    else if(piles[i + 1] > piles[j - 1]){
                        Bob += piles[j];
                        j--;
                    }
                    else{
                        Bob += piles[i];
                        i++;
                    }
                }
            }
            return Alice > Bob;
        }
    }
}
