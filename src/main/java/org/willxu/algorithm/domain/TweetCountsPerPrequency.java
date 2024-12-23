package org.willxu.algorithm.domain;

import java.util.List;

/**
 * A social media company is trying to monitor activity on their site by
 * analyzing the number of tweets that occur in select periods of time.
 * These periods can be partitioned into smaller time chunks based on a
 * certain frequency (every minute, hour, or day).
 * <p>
 * For example, the period [10, 10000] (in seconds) would be partitioned
 * into the following time chunks with these frequencies:
 * <p>
 * - Every minute (60-second chunks): [10,69], [70,129], [130,189], ...,
 *   [9970,10000]
 * - Every hour (3600-second chunks): [10,3609], [3610,7209],
 *   [7210,10000]
 * - Every day (86400-second chunks): [10,10000]
 * <p>
 * Notice that the last chunk may be shorter than the specified
 * frequency's chunk size and will always end with the end time of the
 * period (10000 in the above example).
 * <p>
 * Design and implement an API to help the company with their analysis.
 * <p>
 * Implement the TweetCounts class:
 * <p>
 * TweetCounts() Initializes the TweetCounts object.
 */
public interface TweetCountsPerPrequency {
    /**
     * void recordTweet(String tweetName, int time) Stores the tweetName
     * at the recorded time (in seconds).
     *
     * @param time 0 <= time <= 10^9
     */
    void recordTweet(String tweetName, int time);

    /**
     * Returns a list of integers representing the number of tweets with
     * tweetName in each time chunk for the given period of time
     * [startTime, endTime] (in seconds) and frequency freq.
     * <p>
     * - freq is one of "minute", "hour", or "day" representing a
     *   frequency of every minute, hour, or day respectively.
     *
     * @param startTime,endTime 0 <= time, startTime, endTime <= 10^9
     *                          0 <= endTime - startTime <= 10^4
     */
    List<Integer> getTweetCountsPerFrequency(String freq, String tweetName,
                                             int startTime, int endTime);
}
