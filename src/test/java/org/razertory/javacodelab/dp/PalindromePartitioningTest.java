package org.razertory.javacodelab.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;


public class PalindromePartitioningTest {
    private PalindromePartitioning palindromePartitioning;

    @Before
    public void setup() {
        palindromePartitioning = new PalindromePartitioning();
    }

    @Ignore
    @Test
    public void partition() {
        Assert.assertEquals(Arrays.asList(new String[]{"aa", "b"}, new String[]{"a", "a", "b"}), palindromePartitioning.partition("aab"));
    }
}