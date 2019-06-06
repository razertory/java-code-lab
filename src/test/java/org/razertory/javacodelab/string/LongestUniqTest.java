package org.razertory.javacodelab.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestUniqTest {

    @Test
    public void lengthOfLongestSubstring() {
        String s1 = "showmethe"; // 最长不重复子序列为showmet 长度 7
        LongestUniq longestUniq = new LongestUniq();
        Assert.assertEquals(longestUniq.lengthOfLongestSubstring(s1), 7);
    }
}