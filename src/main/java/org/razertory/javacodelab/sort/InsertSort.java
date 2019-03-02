package org.razertory.javacodelab.sort;

/*
 * 插入排序
 * T: O(n^2) S: O(1)
 */
public class InsertSort {

	public void sort(int[] array) {
		
		for(int i = 1; i < array.length; i++){
			int temp = array[i];
			int j = i - 1;
			while(j >= 0 && array[j] > temp){
				array[j + 1] = array[j];
				j--;
			}
			
			if(j != i - 1){
				array[j + 1] = temp;
			}
		}
	}

}
