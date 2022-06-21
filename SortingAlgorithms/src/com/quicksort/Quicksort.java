package com.quicksort;

import java.util.Scanner;

public class Quicksort {

	public int partition(int array[], int low, int high) {

		int pivot = array[high];
		int i = (low - 1);

		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {

				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}

		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return (i + 1);
	}

	public void quickSort(int array[], int low, int high) {
		if (low < high) {

			int pi = partition(array, low, high);
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
	}

	public int[] getIntegers(int arrayLength) {
		System.out.println("please enter your input:-");
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			System.out.println("printing input " + array[i]);
		}
		return array;
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

//	public static void main(String args[]) {
//
//		int[] data = getIntegers(5);
//		System.out.println("Unsorted Array");
//		printArray(data);
//		int size = data.length;
//		Quicksort.quickSort(data, 0, size - 1);
//		System.out.println("Sorted Array in Ascending Order: ");
//		printArray(data);
//	}
}
