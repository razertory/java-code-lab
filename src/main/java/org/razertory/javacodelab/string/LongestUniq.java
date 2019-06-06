package org.razertory.javacodelab.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 * 维护一个 滑动窗口 和 set, 不断检查下一个元素是否在 set 中即可
 * https://leetcode-cn.com/explore/interview/card/bytedance/242/string/1012/
 */
public class LongestUniq {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;

        while (i < n && j < n) {
            char c = s.charAt(j);
            if (set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
            } else {
                set.add(c);
                j++;
                ans = Math.max(ans, j - i);
            }
        }

        return ans;
    }
}
