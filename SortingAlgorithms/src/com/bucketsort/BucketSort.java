package com.bucketsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {
	public static void main(String[] args) {
		float[] arr = getNumbers(6);
		bucketSort(arr, 7);

		for (float i : arr)
			System.out.print(i + "  ");
	}

	public static float[] getNumbers(int arrayLength) {
		Scanner scanner = new Scanner(System.in);
		float[] array = new float[(int) arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextFloat();
			System.out.println("printing input " + array[i]);
		}
		return array;
	}

	public static void bucketSort(float[] arr, int n) {
		if (n <= 0)
			return;
		ArrayList<Float>[] bucket = new ArrayList[n];

		for (int i = 0; i < n; i++)
			bucket[i] = new ArrayList<Float>();

		for (int i = 0; i < n; i++) {
			int bucketIndex = (int) arr[i] * n;
			bucket[bucketIndex].add(arr[i]);
		}

		for (int i = 0; i < n; i++) {
			Collections.sort((bucket[i]));
		}

		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0, size = bucket[i].size(); j < size; j++) {
				arr[index++] = bucket[i].get(j);
			}
		}
	}

}
