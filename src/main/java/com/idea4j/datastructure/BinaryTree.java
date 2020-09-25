package com.idea4j.datastructure;

public class BinaryTree {
    public static void main(String[] args) {

    }

    /**
     * 前序遍历,访问顺序：先根节点，再左子树，最后右子树；
     * 递归实现
     * @param root
     */
    public void preOrderTraverse1(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + "->");
            preOrderTraverse1(root.left);
            preOrderTraverse1(root.right);
        }
    }
}
