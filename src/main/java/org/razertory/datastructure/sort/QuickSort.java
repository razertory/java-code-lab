package org.razertory.datastructure.sort;

/**
 * 快速排序<br>
 * 时间复杂度: 平均情况是O(nlog(n)),最差情况是O(n^2)<br>
 * 空间复杂度: O(nlog(n))
 * @author razertory
 * @see Sort
 * @see SortTest
 */
public class QuickSort extends Sort {

	public void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	/**
	 * 从left到right排序数组array
	 * @param array
	 * @param left
	 * @param right
	 */
	private void quickSort(int[] array, int left, int right){
	    if (left < right) {
			int index = partition(array, left, right);
			quickSort(array, left, index -1);
			quickSort(array, index + 1, right);
		}
	}
	
	/**
	 * 找出一个基准点，排列数组array左边的都小于它，右边的都大于它
	 * @param array
	 * @return 基准值数组索引
	 */

	private int partition(int[] array, int low, int heigh){
		int left = low;
		int pivot = array[heigh];
		for(int i = low; i < heigh; i++) {
			if (array[i] < pivot) {
				int temp = array[i];
				array[i] = array[left];
				array[left] = temp;
				left++;
			}
		}
		int temp = array[left];
		array[left] = pivot; //or array[heigh]
		array[heigh] = temp;
		return  left;
	}

}
