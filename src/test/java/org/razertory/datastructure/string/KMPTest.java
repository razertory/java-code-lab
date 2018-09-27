package org.razertory.datastructure.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KMPTest {

    @Test
    public void kmpSearch() {
        KMP kmp = new KMP();
        String pat = "我爱";

        Assert.assertTrue(kmp.kmpSearch(pat, "我爱大中国"));

        Assert.assertFalse(kmp.kmpSearch(pat, "我不爱大中国"));
    }
}