package org.razertory.datastructure.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FibonacciTest {
    private Fibonacci fibonacci;
    private Map<Integer, Integer> result;

    @Before
    public void setup() {
        fibonacci = new Fibonacci();
        result = new HashMap();
        result.put(1, 1);
        result.put(2, 1);
        result.put(3, 2);
        result.put(4, 3);
        result.put(5, 5);
        result.put(6, 8);
        result.put(7, 13);
    }

    @Test
    public void fibRecur() {
        result.forEach((k, v) -> {
            Assert.assertEquals(fibonacci.fibRecur(k), (int) v);
        });
    }

    @Test
    public void fibIte() {
        result.forEach((k, v) -> {
            Assert.assertEquals(fibonacci.fibIte(k), (int) v);
        });
    }

    @Test
    public void fibDP() {
        fibonacci = new Fibonacci(result.size() + 1);
        result.forEach((k, v) -> {
            Assert.assertTrue(fibonacci.fibDP(k) == v );
        });
    }
}