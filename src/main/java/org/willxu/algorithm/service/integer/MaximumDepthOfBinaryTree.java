package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface MaximumDepthOfBinaryTree {
    /**
     * Given the root of a binary tree, return its maximum depth.
     *
     * A binary tree's maximum depth is the number of nodes along the
     * number of nodes along the longest path from the root node down
     * to the farthest leaf node.
     *
     * @param root 0 <= root.size <= 10^4
     *             -100 <= Node.val <= 100
     * @return max depth
     */
    int maxDepth(TreeNode root);
}
