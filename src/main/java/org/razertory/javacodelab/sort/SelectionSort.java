package org.razertory.javacodelab.sort;

public class SelectionSort extends Sort {

	public void sort(int[] array) {

		for(int i = 0; i < array.length; i++){
			int temp = array[i];
			for(int j = i; j < array.length; j++){
				if(temp > array[j]){
					temp = array[j];
				}
			}
			
			if(temp != array[i]){
				array[i] = temp;
			}
		}
	}

}
