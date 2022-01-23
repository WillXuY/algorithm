package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.TreeNode;

public interface UnivaluedBinaryTree {
    /**
     * A binary tree is uni-valued if every node in the tree has the
     * same value.
     * Given the root of a binary tree, return true if the given tree is
     * uni-valued, or false otherwise.
     *
     * @param root 1 <= root.size <= 100
     *             0 <= Node.val < 100
     * @return root is a unival tree.
     */
    boolean isUnivalTree(TreeNode root);
}