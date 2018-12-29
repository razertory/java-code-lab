package org.razertory.datastructure.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KMPTest {

    private KMP kmp;

    private String target;      //子串

    @Before
    public void setUp() throws Exception {
        kmp = new KMP();
        target = "我爱";
    }

    @Test
    public void kmp() {
        Assert.assertTrue(kmp.kmpSearch("我爱大中国", target));
        Assert.assertFalse(kmp.kmpSearch("我不可能不爱大中国", target));
    }
}