package com.deepak.sorting;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 9, 20, 1, 3, 55, -1, 2, 0 };
		int rightIndex = arr.length - 1;
		mergeSort(arr, 0, rightIndex);
		System.out.println("-------- Merge Sort -------");
		System.out.println(Arrays.toString(arr));

	}

	public static void mergeSort(int arr[], int leftIndex, int rightIndex) {
		if (leftIndex != rightIndex) {
			int mid = (leftIndex + rightIndex) / 2;
			mergeSort(arr, leftIndex, mid);
			mergeSort(arr, mid + 1, rightIndex);
			merge(arr, leftIndex, mid, rightIndex);
		}

	}

	private static void merge(int arr[], int leftIndex, int mid, int rightIndex) {
		int temp[] = new int[arr.length];

		int leftStart = leftIndex;
		int rightStart = mid + 1;
		int index = leftIndex;
		while ((leftStart <= mid) && (rightStart <= rightIndex)) {
			if (arr[leftStart] <= arr[rightStart]) {
				temp[index] = arr[leftStart];
				++leftStart;
			} else {
				temp[index] = arr[rightStart];
				++rightStart;
			}
			++index;
		}
		while (leftStart <= mid) {
			temp[index] = arr[leftStart];
			++leftStart;
			++index;
		}
		while (rightStart <= rightIndex) {
			temp[index] = arr[rightStart];
			++rightStart;
			++index;
		}
		for (leftStart = leftIndex; leftStart <= rightIndex; leftStart++) {
			arr[leftStart] = temp[leftStart];
		}
	}
}
