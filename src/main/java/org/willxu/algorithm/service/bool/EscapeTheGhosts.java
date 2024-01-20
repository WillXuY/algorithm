package org.willxu.algorithm.service.bool;

public interface EscapeTheGhosts {
    /**
     * You are playing a simplified PAC-MAN game on an infinite 2-D grid.
     * You start at the point [0, 0], and you are given a destination
     * point target = [x_target, y_target] that you are trying to get to.
     * There are several ghosts on the map with their starting positions
     * given as a 2D array ghosts, where ghosts[i] = [x_i, y_i]
     * represents the starting position of the ith ghost. All inputs are
     * integral coordinates.
     * <p>
     * Each turn, you and all the ghosts may independently choose to
     * either move 1 unit in any of the four cardinal directions: north,
     * east, south, or west, or stay still. All actions happen
     * simultaneously.
     * <p>
     * You escape if and only if you can reach the target before any
     * ghost reaches you. If you reach any square (including the target)
     * at the same time as a ghost, it does not count as an escape.
     * <p>
     * Return true if it is possible to escape regardless of how the
     * ghosts move, otherwise return false.
     *
     * @param ghosts 1 <= ghosts.length <= 100
     *               ghosts[i].length == 2
     *               -10^4 <= x_i, y_i <= 10^4
     *               There can be multiple ghosts in the same location.
     * @param target target.length == 2
     *               -10^4 <= x_target, y_target <= 10^4
     */
    boolean escapeGhosts(int[][] ghosts, int[] target);
}