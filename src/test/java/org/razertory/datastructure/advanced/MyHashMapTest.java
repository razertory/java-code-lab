package org.razertory.datastructure.advanced;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class MyHashMapTest {

    private MyHashMap myHashMap;
    private HashMap hashMap;

    @Before
    public void setUp() {
        myHashMap = new MyHashMap();
        hashMap = new HashMap<>();
        hashMap.put("a", "1");
        hashMap.put("b", "2");
        hashMap.put("c", "3");
        hashMap.put("d", "4");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutNull() {
        myHashMap.put(null, null);
    }

    @Test
    public void testMyHashMap() {
        hashMap.forEach((k, v) -> myHashMap.put(k, v));
        hashMap.forEach((k, v) -> Assert.assertEquals(myHashMap.getValue(k), v) );
    }

    @Test
    public void testPutTooMany() {
        int time = 10000;
        for (int i = 0 ; i < time; i++) {
            myHashMap.put(i, i);
        }
    }

    // 用于和自己写的HashMap比较性能
    @Test
    public void testPutTooManyHashMap() {
        int time = 10000;
        for (int i = 0 ; i < time; i++) {
            hashMap.put(i, i);
        }
    }

}