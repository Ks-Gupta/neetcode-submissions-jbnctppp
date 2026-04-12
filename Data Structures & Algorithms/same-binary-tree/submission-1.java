/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
       Queue<TreeNode> que = new LinkedList<>();
       que.add(p);
       que.add(q);

       while(!que.isEmpty()){
         TreeNode n1 = que.poll();
         TreeNode n2 = que.poll();

         if(n1 == null & n2 == null) continue;
         if(n1 == null || n2 == null) return false;
         if(n1.val != n2.val) return false;

         que.add(n1.left); 
         que.add(n2.left); 
         que.add(n1.right); 
         que.add(n2.right); 
       }

       return true;
    }
}
