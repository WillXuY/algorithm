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
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.SameTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.TreeNode.initByListLevel;

public class SameTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        initByListLevel(Stream.of(1, 2, 3)
                                .collect(Collectors.toList())),
                        initByListLevel(Stream.of(1, 2, 3)
                                .collect(Collectors.toList())),
                        true
                ),
                arguments(
                        initByListLevel(Stream.of(1, 2)
                                .collect(Collectors.toList())),
                        initByListLevel(Stream.of(1, null, 2)
                                .collect(Collectors.toList())),
                        false
                ),
                arguments(
                        initByListLevel(Stream.of(1, 2, 1)
                                .collect(Collectors.toList())),
                        initByListLevel(Stream.of(1, 1, 2)
                                .collect(Collectors.toList())),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode p, TreeNode q, boolean output) {
        SameTree recursive = new SameTreeRecursive();
        assertEquals(output, recursive.isSameTree(p, q));
    }
}
