package org.razertory.datastructure.mycollections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MyHashMapTest {

    private MyHashMap map;

    @Before
    public void setUp() throws Exception {
        map = new MyHashMap();
        map.put("liutao", "liutao");
        map.put("liutao1", "liutao1");
        map.put("liutao2", "liutao2");
        map.put("liutao3", "liutao3");
    }

    @Test
    public void put() {
        System.out.println(map);
        System.out.println("----------before-----------");
        map.put("liutao", "liutao111");
        System.out.println("----------after-----------");
        System.out.println(map);
    }

    @Test
    public void getValue() {
        System.out.println(map.getValue("liutao"));
    }

    @After
    public void tearDown() throws Exception {
    }
}