package org.willxu.algorithm.service.string;

public interface RankTeamsByVotes {
    /**
     * In a special ranking system, each voter gives a rank from highest
     * to lowest to all teams participating in the competition.
     * <p>
     * The ordering of teams is decided by who received the most
     * position-one votes. If two or more teams tie in the first
     * position, we consider the second position to resolve the
     * conflict, if they tie again, we continue this process until the
     * ties are resolved. If two or more teams are still tied after
     * considering all positions, we rank them alphabetically based on
     * their team letter.
     * <p>
     * You are given an array of strings votes which is the votes of all
     * voters in the ranking systems. Sort all teams according to the
     * ranking system described above.
     * <p>
     * Return a string of all teams sorted by the ranking system.
     *
     * @param votes 1 <= votes.length <= 1000
     *              1 <= votes[i].length <= 26
     *              votes[i].length == votes[j].length for
     *              0 <= i, j < votes.length.
     *              votes[i][j] is an English uppercase letter.
     *              All characters of votes[i] are unique.
     *              All the characters that occur in votes[0] also occur
     *              in votes[j] where 1 <= j < votes.length.
     */
    String rankTeams(String[] votes);
}
