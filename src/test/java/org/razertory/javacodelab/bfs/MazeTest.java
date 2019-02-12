package org.razertory.javacodelab.bfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class MazeTest {
    private Maze maze;
    private int[][] mazePath;
    @Before
    public void setup() {
        maze = new Maze();
        mazePath = new int[][]{ {0, 0, 1, 0, 0},
                                {0, 0, 0, 0, 0},
                                {0, 0, 0, 1, 0},
                                {1, 1, 0, 1, 1},
                                {0, 0, 0, 0, 0} };
    }

    @Test
    public void hasPath(){
        Assert.assertTrue(maze.hasPath(mazePath, new int[]{0, 4}, new int[]{3, 2}));
    }

    @Test
    public void testContains() {
        ArrayList<Integer[]> h = new ArrayList<>();
        h.add(new Integer[]{1, 4});
        System.out.println(h.contains(new Integer[]{1, 4}));
    }
}