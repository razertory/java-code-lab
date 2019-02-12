package org.razertory.javacodelab.sort;

import java.util.Arrays;

public class ParallelSort extends Sort {
    public void sort(int[] nums) {
        Arrays.parallelSort(nums);
    }
}
