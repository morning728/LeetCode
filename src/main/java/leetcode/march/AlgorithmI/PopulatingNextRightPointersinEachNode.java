package leetcode.march.AlgorithmI;

import java.util.ArrayList;
import java.util.List;

public class PopulatingNextRightPointersinEachNode {
    public static void main(String[] args) {
        new MergeTwoBinaryTrees.Solution().mergeTrees(null, null);
    }

static class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


    static class Solution {
        public Node connect(Node root) {
            if(root == null){
                return null;
            }
            int goal = 1;
            Node temp = root;
            List<Node> nodes = new ArrayList<>();
            while (temp != null){
                recursion(root, goal, 1, nodes);
                for(int i = 0; i < nodes.size() - 1; i++){
                    nodes.get(i).next = nodes.get(i + 1);
                }
                nodes.clear();
                goal++;
                temp = temp.left;
            }
            return root;
        }
        public void recursion(Node root, int goal, int counter, List<Node> nodes){
            if(goal == counter){
                nodes.add(root);
            }
            else{
                counter++;
                recursion(root.left, goal, counter, nodes);
                recursion(root.right, goal, counter, nodes);
            }
        }
    }
}












