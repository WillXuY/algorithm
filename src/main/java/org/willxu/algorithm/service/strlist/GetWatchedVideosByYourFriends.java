package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface GetWatchedVideosByYourFriends {
    /**
     * There are n people, each person has a unique id between 0 and
     * n-1. Given the arrays watchedVideos and friends, where
     * watchedVideos[i] and friends[i] contain the list of watched
     * videos and the list of friends respectively for the person with
     * id = i.
     * <p>
     * Level 1 of videos are all watched videos by your friends, level 2
     * of videos are all watched videos by the friends of your friends
     * and so on. In general, the level k of videos are all watched
     * videos by people with the shortest path exactly equal to k with
     * you. Given your id and the level of videos, return the list of
     * videos ordered by their frequencies (increasing). For videos with
     * the same frequency order them alphabetically from least to
     * greatest.
     *
     * @param watchedVideos n == watchedVideos.length == friends.length
     *                      2 <= n <= 100
     *                      1 <= watchedVideos[i].length <= 100
     *                      1 <= watchedVideos[i][j].length <= 8
     * @param friends 0 <= friends[i].length < n
     *                0 <= friends[i][j] < n
     *                if friends[i] contains j, then friends[j] contains i
     * @param id 0 <= id < n
     * @param level 1 <= level < n
     */
    List<String> watchedVideosByFriends(
            List<List<String>> watchedVideos, int[][] friends, int id,
            int level);
}
