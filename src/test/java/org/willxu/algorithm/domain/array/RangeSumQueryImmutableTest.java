package org.willxu.algorithm.domain.array;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.array.NumArrayCycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumQueryImmutableTest {
    /**
     * At most 10^4 calls will be made to sumRange.
     */
    @Test
    public void testCycle() {
        int[] input = new int[] {-2, 0, 3, -5, 2, -1};
        AbstractNumArray cycle = new NumArrayCycle(input);
        assertEquals(1, cycle.sumRange(0, 2));
        assertEquals(-1, cycle.sumRange(2, 5));
        assertEquals(-3, cycle.sumRange(0, 5));
    }
}
