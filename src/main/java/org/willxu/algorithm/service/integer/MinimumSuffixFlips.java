package org.willxu.algorithm.service.integer;

public interface MinimumSuffixFlips {
	/**
	 * You are given a 0-indexed binary string target of length n. You
	 * have another binary string s of length n that is initially set to
	 * all zeros. You want to make s equal to target.
	 * <p>
	 * In one operation, you can pick an index i where 0 <= i < n and
	 * flip all bits in the inclusive range [i, n - 1]. Flip means
	 * changing '0' to '1' and '1' to '0'.
	 * <p>
	 * Return the minimum number of operations needed to make s equal to
	 * target.
	 * 
	 * @param target n == target.length
	 *               1 <= n <= 10^5
	 *               target[i] is either '0' or '1'.
	 */
	int minFlips(String target);
}
