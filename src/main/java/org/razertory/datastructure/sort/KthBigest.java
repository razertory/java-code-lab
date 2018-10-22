package org.razertory.datastructure.sort;

//https://www.lintcode.com/problem/kth-largest-element/description
public class KthBigest {
    /**
     * @param n:    An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public int kthLargestElement(int n, int[] nums) {
        if (nums == null) {
            return -1;
        }
        return quickSort(0, nums.length - 1, n, nums);
    }


    public static int quickSort(int lo, int hi, int n, int[] nums) {
        if (lo == hi) {
            return nums[lo];
        }
        int index = pos(lo, hi, nums);
        if (index + 1 == n) {
            return nums[index];
        } else if (index + 1 < n) {
            return quickSort(index + 1, hi, n, nums);
        } else {
            return quickSort(lo, index - 1, n, nums);
        }

    }

    //获取中间位置
    public static int pos(int lo, int hi, int[] nums) {
        int key = nums[hi];
        while (lo < hi) {
            while (nums[lo] >= key && lo < hi) {
                lo++;
            }
            ;
            nums[hi] = nums[lo];
            while (nums[hi] <= key && hi > lo) {
                hi--;
            }
            ;
            nums[lo] = nums[hi];

        }
        nums[lo] = key;
        return lo;
    }
}
