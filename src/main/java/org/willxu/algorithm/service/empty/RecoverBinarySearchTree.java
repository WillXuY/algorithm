package org.willxu.algorithm.service.empty;

import org.willxu.algorithm.provide.TreeNode;

public interface RecoverBinarySearchTree {
    /**
     * You are given the root of a binary search tree (BST), where the
     * values of exactly two nodes of the tree were swapped by mistake.
     * Recover the tree without changing its structure.
     *
     * @param root The number of nodes in the tree is in the range
     *             [2, 1000].
     *             -2^31 <= Node.val <= 2^31 - 1
     */
    void recoverTree(TreeNode root);
}
