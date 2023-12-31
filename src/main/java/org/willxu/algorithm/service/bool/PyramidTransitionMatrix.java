package org.willxu.algorithm.service.bool;

import java.util.List;

public interface PyramidTransitionMatrix {
    /**
     * You are stacking blocks to form a pyramid. Each block has a
     * color, which is represented by a single letter. Each row of
     * blocks contains one less block than the row beneath it and is
     * centered on top.
     * <p>
     * To make the pyramid aesthetically pleasing, there are only
     * specific triangular patterns that are allowed. A triangular
     * pattern consists of a single block stacked on top of two blocks.
     * The patterns are given as a list of three-letter strings allowed,
     * where the first two characters of a pattern represent the left
     * and right bottom blocks respectively, and the third character is
     * the top block.
     * <p>
     * - For example, "ABC" represents a triangular pattern with a 'C'
     *   block stacked on top of an 'A' (left) and 'B' (right) block.
     *   Note that this is different from "BAC" where 'B' is on the left
     *   bottom and 'A' is on the right bottom.
     * <p>
     * You start with a bottom row of blocks bottom, given as a single
     * string, that you must use as the base of the pyramid.
     * <p>
     * Given bottom and allowed, return true if you can build the
     * pyramid all the way to the top such that every triangular pattern
     * in the pyramid is in allowed, or false otherwise.
     *
     * @param bottom 2 <= bottom.length <= 6
     * @param allowed 0 <= allowed.length <= 216
     *                allowed[i].length == 3
     *                The letters in all input strings are from the set
     *                {'A', 'B', 'C', 'D', 'E', 'F'}.
     *                All the values of allowed are unique.
     */
    boolean pyramidTransition(String bottom, List<String> allowed);
}
