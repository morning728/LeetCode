package leetcode.march.AlgorithmI;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println();
    }

    public static class Solution  {
        public int firstBadVersion(int n) {
            int l = 1;
            while(l <= n) {
                int mid = l+(n-l)/2;
                if (isBadVersion(mid)) {
                    n = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            return l;
        }

        private boolean isBadVersion(int mid) {
            return false;
        }
    }
}
