package com.review.base.algorithm.sort;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p>
 * 插入排序：複雜度O(n^2)<br>
 * 思想：假定从最开始元素是已排序的，然后从排好序的队列后面开始遍历，如果要插入的元素大于当前元素将元素插入到当前元素后面
 * </p>
 * @author	Administrator 
 * @date	2018年12月4日 上午8:22:24
 * @version      
 */
public class InsertionSort {

	private int[] unSort = new int[] { 1, 8, 6, 2, 5, 7, 4, 9, 3, 0 };

	public void insertionSort(int[] unSort) {
		
		for(int i=1;i<unSort.length;i++) {
			int preIndex = i-1;
			int current =unSort[i];
			while(preIndex >=0&& unSort[preIndex] >current){
				unSort[preIndex+1] = unSort[preIndex]; //將排序的元素，逐個網後移動
				preIndex--;
			}
			
			unSort[preIndex+1] = current; // 將元素插入到排序隊列
		}
	}
	
	@Test
	public void test() {
		InsertionSort sort = new InsertionSort();
		int[] copyOf = Arrays.copyOf(unSort, unSort.length);
		sort.insertionSort(unSort);
		Arrays.sort(copyOf);
		Assert.assertArrayEquals(unSort, copyOf);
	}
}
 