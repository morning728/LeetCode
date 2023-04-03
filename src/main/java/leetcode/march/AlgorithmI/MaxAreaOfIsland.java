package leetcode.march.AlgorithmI;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        System.out.println(new Solution().maxAreaOfIsland());
    }

    public static class Solution  {
        public int maxAreaOfIsland() {
            int[][] grid = new int[][]{new int[]{1,0, 0}, new int[]{1,1, 0}, new int[]{1,0, 1}};

            int x= 0, y = 0;
            AtomicInteger counter = new AtomicInteger(0), res = new AtomicInteger(0);
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[i].length; j++){
                    recursion(grid, j, i, counter);
                    System.out.println(Arrays.deepToString(grid));
                    res.set(Math.max(res.get(), counter.get()));
                    counter.set(0);
                }
            }
            return res.get();
        }
        public void recursion(int[][] grid, int x, int y, AtomicInteger counter){
            if(x >= 0 && y >= 0 && y < grid.length && x < grid[y].length){
                if(grid[y][x] == 0 || grid[y][x] == -1){
                    return;
                } else if (grid[y][x] == 1) {
                    counter.set(counter.get() + 1);
                    grid[y][x] = -1;
                    recursion(grid, x, y - 1, counter);
                    recursion(grid, x - 1, y, counter);
                    recursion(grid, x, y + 1, counter);
                    recursion(grid, x + 1, y, counter);
                }
            }
        }
    }
}
