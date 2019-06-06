package org.razertory.javacodelab.string;

/**
 * 最长公共前缀
 * 不断维护一个当前最长公共前缀即可，当然如果发现是 "" ，那么直接return
 * https://leetcode-cn.com/explore/interview/card/bytedance/242/string/1014
 */
public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
