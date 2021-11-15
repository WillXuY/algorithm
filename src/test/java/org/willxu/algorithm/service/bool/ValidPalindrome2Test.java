/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ValidPalindrome2Loop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ValidPalindrome2Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answe 1:
                arguments("aguokepatgbnvfqmgmlcupuuf"
                        + "xoohdfpgjdmysgvhmvffcnqxj"
                        + "jxqncffvmhvgsymdjgpfdhoox"
                        + "fuupuc" + "u" + "lmgmqfvnbgtapekouga", true),
                arguments("aba", true),
                arguments("abca", true),
                arguments("abc", false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String input, boolean excepted) {
        ValidPalindrome2 loop = new ValidPalindrome2Loop();
        assertEquals(excepted, loop.validPalindrome(input));
    }
}
