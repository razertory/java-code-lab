package org.razertory.javacodelab.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * N 皇后问题
 * https://leetcode.com/problems/n-queens/
 **/
public class NQueen {
    private List<String> board;
    private boolean[] cols;
    private boolean[] diag1;
    private boolean[] diag2;
    private List<List<String>> solution;

    public List<List<String>> solveNQueens(int n) {
        solution = new ArrayList<>();
        board = new ArrayList<>();
        char[] charArray = new char[n];
        Arrays.fill(charArray, '.');
        for (int i = 0; i < n; i++) {
            board.add(new String(charArray));
        }
        cols = new boolean[n];
        diag1 = new boolean[2 * n - 1];
        diag2 = new boolean[2 * n - 1];
        nQueens(n, 0);
        return solution;
    }

    private void nQueens(int n, int y) {
        if (y == n) {
            solution.add(new ArrayList<>(board));
            return;
        }

        for (int x = 0; x < n; x++) {
            if (!available(x, y, n)) continue;
            updateBoard(x, y, n, true);
            nQueens(n, y + 1);
            updateBoard(x, y, n, false);
        }
    }

    private boolean available(int x, int y, int n) {
        return !cols[x] && !diag1[x + y] && !diag2[x - y + n - 1];
    }

    private void updateBoard(int x, int y, int n, boolean put) {
        cols[x] = put;
        diag1[x + y] = put;
        diag2[x - y + n - 1] = put;
        char[] columns = board.get(y).toCharArray();
        columns[x] = put ? 'Q' : '.';
        board.set(y, new String(columns));
    }
}
