package org.willxu.algorithm.service.intlist;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface BinaryTreeLevelOrderTraversal {
    /**
     * Given the root of a binary tree, return the level order traversal
     * of its nodes' values. (i.e., from left to right, level by level).
     *
     * @param root The number of nodes in the tree is in the range
     *             [0, 2000].
     *             -1000 <= Node.val <= 1000
     */
    List<List<Integer>> levelOrder(TreeNode root);
}
