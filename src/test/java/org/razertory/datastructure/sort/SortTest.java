package org.razertory.datastructure.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * 排序测试
 * @author razertory
 * @test
 * 生成大量的随机整数，通过实际效果比较各个排序算法的性能
 * @see Sort
 * @see BubbleSort
 * @see SelectionSort
 * @see MergeSort
 * @see QuickSort
 */
public class SortTest {
	int size = 100000;
	int[] array = new int[size];
	Sort sort;
	
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
		sort.sort(array);
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

	@Test
	public void testParallelSort(){
	    sort = new ParallelSort();
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
