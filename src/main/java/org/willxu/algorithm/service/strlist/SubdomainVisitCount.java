package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface SubdomainVisitCount {
    /**
     * A website domain "discuss.leetcode.com" consists of various
     * subdomains. At the top level, we have "com", at the next level,
     * we have "leetcode.com" and at the lowest level,
     * "discuss.leetcode.com". When we visit a domain like
     * "discuss.leetcode.com", we will also visit the parent domains
     * "leetcode.com" and "com" implicitly.
     * <p>
     * A count-paired domain is a domain that has one of the two formats
     * "rep d1.d2.d3" or "rep d1.d2" where rep is the number of visits
     * to the domain and d1.d2.d3 is the domain itself.
     * <p>
     * - For example, "9001 discuss.leetcode.com" is a count-paired
     *   domain that indicates that discuss.leetcode.com was visited
     *   9001 times.
     * <p>
     * Given an array of count-paired domains cpdomains, return an array
     * of the count-paired domains of each subdomain in the input. You
     * may return the answer in any order.
     *
     * @param cpdomains 1 <= cpdomain.length <= 100
     *                  1 <= cpdomain[i].length <= 100
     *                  cpdomain[i] follows either the
     *                  "rep_i d1_i.d2_i.d3_i" format or the
     *                  "rep_i d1_i.d2_i" format.
     *                  rep_i is an integer in the range [1, 10^4].
     *                  d1_i, d2_i, and d3_i consist of lowercase
     *                  English letters.
     */
    List<String> subdomainVisits(String[] cpdomains);
}
