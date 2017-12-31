package org.razertory.datastructure.sort;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * 排序测试
 * @author razertory
 * @see ISort
 * @see BubbleSort
 * @see SelectionSort
 * @see MergeSort
 * @see QuickSort
 */
public class SortTest {
	int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	ISort sort;
	
	@Before
	public void before(){
		int[] arrayIni = {10, 9, 8, 7, 6, 5, 4, 4, 1, -1};
		for(int i = 0; i < array.length; i++){
			array[i] = arrayIni[i];
		}
		printArr(array);
	}
	
	@Test
	public void testBubbleSort(){
		sort = new BubbleSort();
		sort.sort(array);
		printArr(array);
		validate();
	}
	
	@Test
	public void testSelectionSort(){
		sort = new SelectionSort();
		sort.sort(array);
		validate();
	}
	
	@Test
	public void testMergeSort(){
		sort = new MergeSort();
		sort.sort(array);
		validate();
		
	}
	
	@Test
	public void testQuickSort(){
		sort = new QuickSort();
		sort.sort(array);
		validate();
	}
	
	@Test
	public void testInsertSort(){
		sort = new InsertSort();
		sort.sort(array);
		validate();
	}
	
	@Test
	public void testInsertOptimizeSort(){
		sort = new InsertOptimizeSort();
		sort.sort(array);
		validate();
	}

	//to validate the next number is always bigger
	private void validate(){
		for(int i = 0; i < array.length - 1; i++){
			Assert.assertTrue(array[i] <= array[i + 1]);
		}
	}

	private void printArr(int [] array) {
		for(int i = 0; i < array.length; i++){
		    System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}
}
