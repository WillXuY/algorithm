/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.ToLowerCase;

public class ToLowerCaseLoop implements ToLowerCase {
    @Override
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <='Z') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}