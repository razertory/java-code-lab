package org.razertory.javacodelab.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 无重复数组的全排列
 * https://leetcode.com/problems/subsets
 **/
public class SubSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        backTrack(list, new ArrayList(), nums, 0);
        return list;
    }

    private void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backTrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
