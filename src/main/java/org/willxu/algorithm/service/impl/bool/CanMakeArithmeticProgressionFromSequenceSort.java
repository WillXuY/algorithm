package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CanMakeArithmeticProgressionFromSequence;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequenceSort
        implements CanMakeArithmeticProgressionFromSequence {
    @Override
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (diff != arr[i] - arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
