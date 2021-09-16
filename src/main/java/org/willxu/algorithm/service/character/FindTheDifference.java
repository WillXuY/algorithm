package org.willxu.algorithm.service.character;

public interface FindTheDifference {
    /**
     * You are given two string s and t.
     * String t is generated by random shuffling string s and then add
     * one more letter at a random position.
     * Return the letter that was added to t.
     *
     * @param s 0 <= s.length <= 1000
     *          consist of lower-case English letters.
     * @param t t.length = s.length + 1
     *          consist of lower-case English letters.
     * @return the difference character.
     */
    char findTheDifference(String s, String t);
}