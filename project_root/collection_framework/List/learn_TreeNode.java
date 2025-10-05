import java.util.*;

// we'll be implementing a basic structure of a binary tree using TreeNode class
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    // constructor
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}


public class learn_TreeNode{
    public static void main(String[] args){
        // creating nodes
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // simple traversal (pre-order)
        preOrderTraversal(root); // expected output: 1 2 4 5 3
    }

    // pre-order traversal (root -> left -> right)
    public static void preOrderTraversal(TreeNode node){
        if(node == null) return;

        System.out.print(node.val + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}