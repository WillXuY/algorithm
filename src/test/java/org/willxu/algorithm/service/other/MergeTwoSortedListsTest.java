package org.willxu.algorithm.service.other;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.other.MergeTwoSortedListsBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.ListNode.getListNodeFromIntArray;

public class MergeTwoSortedListsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        getListNodeFromIntArray(new int[] {1, 2, 4}),
                        getListNodeFromIntArray(new int[] {1, 3, 4}),
                        getListNodeFromIntArray(new int[] {1, 1, 2, 3, 4, 4})
                ),
                arguments(
                        // leetcode [] means input and output is null
                        null,
                        null,
                        null
                ),
                arguments(
                        null,
                        getListNodeFromIntArray(new int[] {0}),
                        getListNodeFromIntArray(new int[] {0})
                )
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testMergeTwoLists(ListNode l1, ListNode l2, ListNode output) {
        MergeTwoSortedLists bruteForce = new MergeTwoSortedListsBruteForce();
        ListNode result = bruteForce.mergeTwoLists(l1, l2);
        if (output != null && result != null) {
            assertArrayEquals(output.toIntArray(), result.toIntArray());
        } else {
            assertNull(output);
            assertNull(result);
        }
    }
}
