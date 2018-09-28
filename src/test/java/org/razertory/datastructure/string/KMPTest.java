package org.razertory.datastructure.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KMPTest {
    KMP kmp;

    @Before
    public void setup() {
        this.kmp = new KMP();
    }

    @Test
    public void kmpSearch() {
        String pat = "我爱";

        Assert.assertTrue(kmp.kmpSearch(pat, "我爱大中国"));

        Assert.assertFalse(kmp.kmpSearch(pat, "我不爱大中国"));
    }
}