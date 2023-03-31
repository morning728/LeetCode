package leetcode.march.AlgorithmI;

import java.util.Arrays;

public class RemoveNthNodeFr4omEndOfList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SquaresOfASortedArray.Solution().sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int counter = 1; ListNode temp = head;
            while(temp.next != null){
                counter++;
                temp = temp.next;
            }
            temp = head;

            for(int i = 0; i < counter - n - 1; i++){
                temp = temp.next;
            }

            if(n == counter){
                return temp.next;
            }
            else if(n == 1){
                temp.next = null;
            }
            else{
                temp.next = temp.next.next;
            }
            return head;
        }
    }
}
