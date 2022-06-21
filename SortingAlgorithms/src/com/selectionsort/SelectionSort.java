package com.selectionsort;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String args[]) {
		System.out.println("input your array ");
		int arr[] = getIntegers(6);
		sort(arr);
		System.out.println("Sorted array");
		printArray(arr);
	}

	public static int[] getIntegers(int arrayLength) {
		System.out.println("please enter your input:-");
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			System.out.println("printing input " + array[i]);
		}
		return array;
	}

	public static void printArray(int[] array) {
		System.out.println("Printing my array ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
		System.out.println(" ");
	}

	public static void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

}