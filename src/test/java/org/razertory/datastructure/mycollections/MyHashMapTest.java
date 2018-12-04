package org.razertory.datastructure.mycollections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class MyHashMapTest {

    private MyHashMap myHashMapmap;
    private HashMap hashMap;

    @Before
    public void setUp() {
        myHashMapmap = new MyHashMap();
        hashMap = new HashMap<>();
        hashMap.put("a", "1");
        hashMap.put("b", "2");
        hashMap.put("c", "3");
        hashMap.put("d", "4");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutNull() {
        myHashMapmap.put(null, null);
    }

    @Test
    public void testMyHashMap() {
        hashMap.forEach((k, v) -> myHashMapmap.put(k, v));
        hashMap.forEach((k, v) -> Assert.assertEquals(myHashMapmap.getValue(k), v) );
    }

}