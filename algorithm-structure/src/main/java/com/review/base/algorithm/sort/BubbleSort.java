package com.review.base.algorithm.sort;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p>
 * 冒泡排序算法：複雜度O(n^2)<br>
 * 思想：比较相邻的两个元素，将大的元素放在后面，這樣最大的元素就在最後面
 * </p>
 * 
 * @author Administrator
 * @date 2018年12月4日 上午7:43:12
 * @version
 */
public class BubbleSort {

	private int[] unSort = new int[] { 1, 8, 6, 2, 5, 7, 4, 9, 3, 0 };

	public void bubbleSort(int[] unSort) {

		if (unSort == null || unSort.length <= 1) {
			return;
		}
		for (int i = 0; i < unSort.length - 1; i++) {
			for (int j = 0; j < unSort.length - 1 - i; j++) {
				if (unSort[j] > unSort[j + 1]) { //比较相邻的两个元素
					int tmp = unSort[j + 1];//交换
					unSort[j + 1] = unSort[j];
					unSort[j] = tmp;
				}
			}
		}
	}

	@Test
	public void test() {
		BubbleSort bubbleSort = new BubbleSort();
		int[] copyOf = Arrays.copyOf(unSort, unSort.length);
		bubbleSort.bubbleSort(unSort);
		Arrays.sort(copyOf);
		Assert.assertArrayEquals(unSort, copyOf);
	}
}
