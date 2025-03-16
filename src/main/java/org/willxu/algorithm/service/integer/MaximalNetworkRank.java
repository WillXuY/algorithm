package org.willxu.algorithm.service.integer;

public interface MaximalNetworkRank {

	/**
	 * There is an infrastructure of n cities with some number of roads
	 * connecting these cities. Each roads[i] = [a_i, b_i] indicates
	 * that there is a bidirectional road between cities a_i and b_i.
	 * <p>
	 * The network rank of two different cities is defined as the total
	 * number of directly connected roads to either city. If a road is
	 * directly connected to both cities, it is only counted once.
	 * <p>
	 * The maximal network rank of the infrastructure is the maximum
	 * network rank of all pairs of different cities.
	 * <p>
	 * Given the integer n and the array roads, return the maximal
	 * network rank of the entire infrastructure.
	 * 
	 * @param n 2 <= n <= 100
	 * @param roads 0 <= roads.length <= n * (n - 1) / 2
	 *              roads[i].length == 2
	 *              0 <= a_i, b_i <= n-1
	 *              a_i != b_i
	 *              Each pair of cities has at most one road connecting
	 *              them.
	 */
	int maximalNetworkRank(int n, int[][] roads);
}
