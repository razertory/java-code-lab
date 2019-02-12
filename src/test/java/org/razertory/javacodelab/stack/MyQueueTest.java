package org.razertory.javacodelab.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class MyQueueTest {
    private MyQueue myQueue;

    @Before
    public void setUp() {
        myQueue = new MyQueue();
    }

    @Test
    public void push() {
        myQueue.push(1);
        Assert.assertEquals(1, myQueue.peek());
    }

    @Test
    public void pop() {
        myQueue.push(1);
        myQueue.push(3);
        myQueue.pop();
        Assert.assertEquals(3, myQueue.peek());
    }

    @Test
    public void isEmpty() {
        Assert.assertTrue(myQueue.isEmpty());
        myQueue.push(1);
        Assert.assertFalse(myQueue.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void testEmptyPeek() {
        Assert.assertNull(myQueue.peek());
    }
}