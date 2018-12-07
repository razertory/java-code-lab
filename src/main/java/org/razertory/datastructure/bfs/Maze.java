package org.razertory.datastructure.bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//https://www.lintcode.com/problem/the-maze/description
public class Maze {
    /**
     * @param maze: the maze
     * @param start: the start
     * @param destination: the destination
     * @return: whether the ball could stop at the destination
     */
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        // write your code here
        if ((maze[start[0]][start[1]] == 1) || (maze[destination[0]][destination[1]] == 1)) {
            return false;
        }

        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[]{start[0], start[1]});
        while(!queue.isEmpty()) {
            Integer[] s = queue.poll();
            int i = s[0];
            int j = s[1];
            if (i == destination[0] && j == destination[1]) {
                return true;
            }
            maze[i][j] = -1;
            travel(i, j + 1, queue, maze);
            travel(i + 1, j, queue, maze);
            travel(i, j - 1, queue, maze);
            travel(i - 1, j, queue, maze);
        }
        return false;
    }

    private boolean inPath(int i, int j , int[][]maze) {
        return (i >= 0  && i < maze[0].length) && (j >=0 && j < maze.length) && (maze[i][j] != 1);
    }

    private void travel(int i, int j, Queue<Integer[]> queue, int[][]maze) {
        Integer[] s = new Integer[]{i, j};
        if (inPath(i, j, maze) && maze[i][j] != -1) {
            queue.offer(s);
        }
    }

}
