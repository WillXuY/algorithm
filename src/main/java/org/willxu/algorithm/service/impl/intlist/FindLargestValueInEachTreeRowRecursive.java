package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.intlist.FindLargestValueInEachTreeRow;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueInEachTreeRowRecursive
        implements FindLargestValueInEachTreeRow {
    @Override
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> levelLargestList = new ArrayList<>();
        if (root == null) {
            return levelLargestList;
        }
        levelLargestList.add(root.val);
        if (root.left == null && root.right == null) {
            return levelLargestList;
        }
        levelLargestList.addAll(largestValues(root.left));
        List<Integer> rightList = largestValues(root.right);
        for (int i = 1; i <= rightList.size(); i++) {
            int right = rightList.get(i - 1);
            if (i < levelLargestList.size()) {
                levelLargestList.set(i, Math.max(levelLargestList.get(i), right));
            } else {
                levelLargestList.add(right);
            }
        }
        return levelLargestList;
    }
}