/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.treenode;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.treenode.MergeTwoBinaryTrees;

public class MergeTwoBinaryTreesRecursive implements MergeTwoBinaryTrees {
    @Override
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode output = new TreeNode();
        output.val = root1.val + root2.val;
        output.left = mergeTrees(root1.left, root2.left);
        output.right = mergeTrees(root1.right, root2.right);
        return output;
    }
}
