package org.razertory.datastructure.sort;

//https://www.lintcode.com/problem/kth-largest-element/description
public class KthBigest {

    public int kthLargestElement(int k, int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        return kthLargest(0, nums.length - 1, k, nums);
    }

    public int kthLargest(int low, int high, int k, int[] nums) {
        if (low == high) {
            return nums[low];
        }

        int index = partition(low, high, nums);

        if (index + 1 == k) {
            return nums[index];
        } else if (index + 1 < k) {
            return kthLargest(index + 1, high, k, nums);
        } else {
            return kthLargest(low, index - 1, k, nums);
        }
    }

    //获取中间位置
    public int partition(int low, int high, int[] nums) {
        int key = nums[high];

        while (low < high) {
            while (nums[low] >= key && low < high) {
                low++;
            }
            nums[high] = nums[low];
            while (nums[high] <= key && high > low) {
                high--;
            }
            nums[low] = nums[high];
        }
        nums[low] = key;

        return low;
    }
}
