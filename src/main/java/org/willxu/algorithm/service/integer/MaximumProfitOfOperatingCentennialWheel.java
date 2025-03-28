package org.willxu.algorithm.service.integer;

public interface MaximumProfitOfOperatingCentennialWheel {
	/**
	 * You are the operator of a Centennial Wheel that has four
	 * gondolas, and each gondola has room for up to four people. You
	 * have the ability to rotate the gondolas counterclockwise, which
	 * costs you runningCost dollars.
	 * <p>
	 * You are given an array customers of length n where customers[i]
	 * is the number of new customers arriving just before the i^th
	 * rotation (0-indexed). This means you must rotate the wheel i
	 * times before the customers[i] customers arrive. You cannot make
	 * customers wait if there is room in the gondola. Each customer
	 * pays boardingCost dollars when they board on the gondola closest
	 * to the ground and will exit once that gondola reaches the ground
	 * again.
	 * <p>
	 * You can stop the wheel at any time, including before serving all
	 * customers. If you decide to stop serving customers, all
	 * subsequent rotations are free in order to get all the customers
	 * down safely. Note that if there are currently more than four
	 * customers waiting at the wheel, only four will board the gondola,
	 * and the rest will wait for the next rotation.
	 * <p>
	 * Return the minimum number of rotations you need to perform to
	 * maximize your profit. If there is no scenario where the profit is
	 * positive, return -1.
	 * 
	 * @param customers n == customers.length
	 *                  1 <= n <= 10^5
	 *                  0 <= customers[i] <= 50
	 * @param boardingCost,runningCost 1 <= boardingCost, runningCost <= 100
	 */
	int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost);
}
