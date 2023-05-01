package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.intlist.BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversalList
        implements BinaryTreeZigzagLevelOrderTraversal {
    @Override
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> zigzagList = new ArrayList<>();
        zigzagList.add(root);
        boolean leftFirst = false;
        while (zigzagList.size() > 0) {
            List<Integer> r = new ArrayList<>();
            List<TreeNode> nextList = new ArrayList<>();
            for (TreeNode z: zigzagList) {
                r.add(z.val);
                if (z.left != null) {
                    nextList.add(z.left);
                }
                if (z.right != null) {
                    nextList.add(z.right);
                }
            }
            if (leftFirst) {
                Collections.reverse(r);
            }
            result.add(r);
            zigzagList = nextList;
            leftFirst = !leftFirst;
        }
        return result;
    }
}