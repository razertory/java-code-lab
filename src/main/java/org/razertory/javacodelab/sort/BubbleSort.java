package org.razertory.javacodelab.sort;

/*
 * 冒泡排序
 * T: O(n^2) S: O(1)
 */
class BubbleSort {
	void sort(int[] array) {
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length - 1 - i; j++){
				if(array[j] > array[j + 1]){
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}
