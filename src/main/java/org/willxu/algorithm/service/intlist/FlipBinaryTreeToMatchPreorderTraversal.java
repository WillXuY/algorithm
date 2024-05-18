package org.willxu.algorithm.service.intlist;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface FlipBinaryTreeToMatchPreorderTraversal {
    /**
     * You are given the root of a binary tree with n nodes, where each
     * node is uniquely assigned a value from 1 to n. You are also given
     * a sequence of n values voyage, which is the desired pre-order
     * traversal of the binary tree.
     * <p>
     * Any node in the binary tree can be flipped by swapping its left
     * and right subtrees. For example, flipping node 1 will have the
     * following effect:
     * <p>
     *   1                    1
     *  /\                   /\
     * 2  3                 3  2
     *   /\                /\
     *  4  5              4 5
     * <p>
     * Flip the smallest number of nodes so that the pre-order traversal
     * of the tree matches voyage.
     * <p>
     * Return a list of the values of all flipped nodes. You may return
     * the answer in any order. If it is impossible to flip the nodes in
     * the tree to make the pre-order traversal match voyage, return the
     * list [-1].
     *
     * @param root The number of nodes in the tree is n.
     * @param voyage n == voyage.length
     *               1 <= n <= 100
     *               1 <= Node.val, voyage[i] <= n
     *               All the values in the tree are unique.
     *               All the values in voyage are unique.
     */
    List<Integer> flipMatchVoyage(TreeNode root, int[] voyage);
}
