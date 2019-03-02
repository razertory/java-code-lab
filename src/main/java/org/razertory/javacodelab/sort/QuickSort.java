package org.razertory.javacodelab.sort;

public class QuickSort {

	public void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private void quickSort(int[] array, int left, int right){
	    if (left < right) {
			int index = partition(array, left, right);
			quickSort(array, left, index -1);
			quickSort(array, index + 1, right);
		}
	}

	private int partition(int[] array, int low, int high){
		int pivot = array[low], index = low;
		for (int i = low; i <= high; i++) {
		    if (array[i] < pivot) {
		    	index++;
		    	swap(array, i, index);
			}
		}
		swap(array, index, low);
	    return index;
	}

	private void swap(int []array, int i, int j ) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	// 第二种 partition
//	private int partition(int[] array, int low, int high) {
//		int p = array[low];
//		int i = low, j = high;
//		while(i < j) {
//			while (i < j && array[j] > p) j--;
//			if(i < j) swap(array, i, j);
//			while (i < j && array[i] <= p) i++;
//			if(i < j) swap(array, i, j);
//		}
//		return i;
//	}

}
