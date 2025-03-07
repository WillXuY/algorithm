package org.willxu.algorithm.service.ints;

public interface NumberOfNodesInTheSubTreeWithTheSameLabel {
	/**
	 * You are given a tree (i.e. a connected, undirected graph that has
	 * no cycles) consisting of n nodes numbered from 0 to n - 1 and
	 * exactly n - 1 edges. The root of the tree is the node 0, and each
	 * node of the tree has a label which is a lower-case character
	 * given in the string labels (i.e. The node with the number i has
	 * the label labels[i]).
	 * <p>
	 * The edges array is given on the form edges[i] = [a_i, b_i], which
	 * means there is an edge between nodes a_i and b_i in the tree.
	 * <p>
	 * Return an array of size n where ans[i] is the number of nodes in
	 * the subtree of the i^th node which have the same label as node i.
	 * <p>
	 * A subtree of a tree T is the tree consisting of a node in T and
	 * all of its descendant nodes.
	 * 
	 * @param n 1 <= n <= 10^5
	 * @param edges edges.length == n - 1
	 *              edges[i].length == 2
	 *              0 <= a_i, b_i < n
	 *              a_i != b_i
	 * @param labels labels.length == n
	 *               labels is consisting of only of lowercase English
	 *               letters.
	 */
int[] countSubTrees(int n, int[][] edges, String labels);
}
