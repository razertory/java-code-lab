package org.razertory.javacodelab.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPrefixTest {

    @Test
    public void longestCommonPrefix() {
        LongestPrefix longestPrefix = new LongestPrefix();
        String[] strs = new String[]{"abstract", "abort", "abolish", "abandoned"};
        String expect = longestPrefix.longestCommonPrefix(strs);
        Assert.assertEquals(expect, "ab");
    }
}