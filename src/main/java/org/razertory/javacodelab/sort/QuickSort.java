package org.razertory.javacodelab.sort;

public class QuickSort extends Sort {

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
		int left = low;
		int pivot = array[high];
		for(int i = low; i < high; i++) {
			if (array[i] < pivot) {
                int temp = array[i];
                array[i] = array[left];
                array[left] = temp;
                left++;
			}
		}
		int temp = array[left];
		array[left] = pivot; //or array[high]
		array[high] = temp;
		return  left;
	}

}
