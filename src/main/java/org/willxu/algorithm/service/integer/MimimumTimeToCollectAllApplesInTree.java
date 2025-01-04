package org.willxu.algorithm.service.integer;

import java.util.List;

public interface MimimumTimeToCollectAllApplesInTree {
    /**
     * Given an undirected tree consisting of n vertices numbered from 0
     * to n-1, which has some apples in their vertices. You spend 1
     * second to walk over one edge of the tree. Return the minimum time
     * in seconds you have to spend to collect all apples in the tree,
     * starting at vertex 0 and coming back to this vertex.
     * <p>
     * The edges of the undirected tree are given in the array edges,
     * where edges[i] = [a_i, b_i] means that exists an edge connecting
     * the vertices a_i and b_i. Additionally, there is a boolean array
     * hasApple, where hasApple[i] = true means that vertex i has an
     * apple; otherwise, it does not have any apple.
     *
     * @param n 1 <= n <= 10^5
     * @param edges edges.length == n - 1
     *              edges[i].length == 2
     *              0 <= a_i < b_i <= n - 1
     * @param hasApple hasApple.length == n
     */
    int minTime(int n, int[][] edges, List<Boolean> hasApple);
}
