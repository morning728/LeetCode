package leetcode.march.AlgorithmI;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        System.out.println();
    }


      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    static class Solution {
        public ListNode middleNode(ListNode head) {
            int counter = 1; ListNode temp = head;
            while(temp.next != null){
                counter++;
                temp = temp.next;
            }
            for(int i = 1; i < counter / 2 + 1; i ++){
                head = head.next;
            }
            return head;

        }
    }
}
