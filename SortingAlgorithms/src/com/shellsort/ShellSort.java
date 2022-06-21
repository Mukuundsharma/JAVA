package com.shellsort;

import java.util.Scanner;

public class ShellSort {

	public static void main(String args[]) {
		int arr[] = getIntegers(8);
		System.out.println("Array before sorting");
		printArray(arr);
		sort(arr);
		System.out.println("Array after sorting");
		printArray(arr);
	}

	public static int[] getIntegers(int arrayLength) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			System.out.println("printing input " + array[i]);
		}
		return array;
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static int sort(int arr[]) {
		int n = arr.length;

		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i += 1) {
				int temp = arr[i];
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];

				arr[j] = temp;
			}
		}
		return 0;
	}
}
