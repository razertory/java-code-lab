package org.razertory.javacodelab.sort;

/**
 * Time O(n^2) Space O(1)
 */
public class InsertSort extends Sort {

	@Override
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
