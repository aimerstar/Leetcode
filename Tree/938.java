/**
 * 加總二元搜尋數介於L和R的值
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int ans=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        get(root, L, R);
        return ans;
    }
    
    public void get(TreeNode root, int L, int R){
        if(root != null){
            if(root.val >= L && root.val <=R){
                ans += root.val;
            }
            if(root.val > L){
                get(root.left, L, R);
            }
            if(root.val < R){
                get(root.right, L, R);
            }
        }
    }
}
