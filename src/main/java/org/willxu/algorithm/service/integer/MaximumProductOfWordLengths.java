package org.willxu.algorithm.service.integer;

public interface MaximumProductOfWordLengths {
    /**
     * Given a string array words, return the maximum value of
     * length(word[i]) * length(word[j]) where the two words do not
     * share common letters. If no such two words exist, return 0.
     *
     * @param words 2 <= words.length <= 1000
     *              1 <= words[i].length <= 1000
     *              words[i] consists only of lowercase English letters.
     */
    int maxProduct(String[] words);
}
