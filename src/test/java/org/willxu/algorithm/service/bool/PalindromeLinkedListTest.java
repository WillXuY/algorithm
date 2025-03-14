/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.bool.PalindromeLinkedListArray;
import org.willxu.algorithm.service.impl.bool.PalindromeLinkedListStackAndQueue;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PalindromeLinkedListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2, 2, 1
                        }),
                        true
                ),
                arguments(
                        ListNode.getListNodeFromIntArray(new int[] {
                                1, 2
                        }),
                        false
                )
        );
    }

    @ParameterizedTest(name = "array {index}")
    @MethodSource("dataProvider")
    public void testArray(ListNode input, boolean expected) {
        PalindromeLinkedList array= new PalindromeLinkedListArray();
        assertEquals(expected, array.isPalindrome(input));
    }

    @ParameterizedTest(name = "Stack and queue {index}")
    @MethodSource("dataProvider")
    public void testStackAndQueue(ListNode input, boolean expected) {
        PalindromeLinkedList stackAndQueue =
                new PalindromeLinkedListStackAndQueue();
        assertEquals(expected, stackAndQueue.isPalindrome(input));
    }
}
