package com.review.base.algorithm.sort;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p>
 * 选择排序：选择最小的元素，将他放在最前面；<br>
 * 時間複雜度：O(n^2)
 * </p>
 * 
 * @author Administrator
 * @date 2018年12月4日 上午8:06:42
 * @version
 */
public class SelectionSort {

	private int[] unSort = new int[] { 1, 8, 6, 2, 5, 7, 4, 9, 3, 0 };

	public void selectionSort(int[] unSort) {

		for (int i = 0; i <= unSort.length - 1; i++) {
			int min = unSort[i];
			int idx = i;
			for (int j = i + 1; j <= unSort.length - 1; j++) {
				if (min > unSort[j]) {
					min = unSort[j]; //寻找最小数
					idx = j; //尋找最小數索引
				}
			}
			unSort[idx] = unSort[i];   //交换顺序
			unSort[i] = min;//將最小數放在最前面
		}
	}

	@Test
	public void test() {
		SelectionSort sort = new SelectionSort();
		int[] copyOf = Arrays.copyOf(unSort, unSort.length);
		sort.selectionSort(unSort);
		Arrays.sort(copyOf);
		Assert.assertArrayEquals(unSort, copyOf);
	}
}
