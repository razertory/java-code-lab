package org.razertory.datastructure.sort;

//https://www.lintcode.com/problem/kth-largest-element/description
public class KthBigest {
    /**
     * @param n:    An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public int kthLargestElement(int n, int[] nums) {
        quickSort(0, nums.length - 1, nums);
        int key = nums.length - n;
        return nums[key];
    }


    public static void quickSort(int lo, int hi, int[] nums) {
        if (lo > hi) {
            return;
        }
        int index = pos(lo, hi, nums);
        quickSort(lo, index - 1, nums);
        quickSort(index + 1, hi, nums);

    }

    //获取中间位置
    public static int pos(int lo, int hi, int[] nums) {
        int key = nums[lo];
        while (lo < hi) {
            while (nums[hi] >= key && lo < hi) {
                hi--;
            }
            nums[lo] = nums[hi];
            while (nums[lo] <= key && lo < hi) {
                lo++;
            }
            nums[hi] = nums[lo];
        }
        nums[hi] = key;
        return hi;
    }
}
