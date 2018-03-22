package org.razertory.datastructure.sort;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * 排序测试
 * @author razertory
 * @test
 * 生成大量的随机整数，通过实际效果比较各个排序算法的性能
 * @see ISort
 * @see BubbleSort
 * @see SelectionSort
 * @see MergeSort
 * @see QuickSort
 */
public class SortTest {
	int size = 100000;//10万
	int[] array = new int[size];
	ISort sort;
	
	@Before
	public void before(){
		Random rand = new Random();
		for (int i = 0; i< size; i++) {
		    array[i] = rand.nextInt(size);
		}
	}
	
	@Test
	public void testBubbleSort(){
		sort = new BubbleSort();
		Long before = System.currentTimeMillis();
		sort.sort(array);
		System.out.println("Bubble sort cast :" + (System.currentTimeMillis() - before));
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
		Long before = System.currentTimeMillis();
		sort.sort(array);
		System.out.println("Merge sort cast :" + (System.currentTimeMillis() - before));
		validate();
		
	}
	
	@Test
	public void testQuickSort(){
		sort = new QuickSort();
		Long before = System.currentTimeMillis();
		sort.sort(array);
		System.out.println("Quick sort cast :" + (System.currentTimeMillis() - before));
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

}
