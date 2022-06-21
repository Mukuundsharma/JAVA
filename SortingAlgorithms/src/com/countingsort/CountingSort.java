package com.countingsort;

import java.util.Scanner;

public class CountingSort {
	public void countSort(int array[], int size) {
		int[] output = new int[size + 1];
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > max)
				max = array[i];
		}
		int[] count = new int[max + 1];
		for (int i = 0; i < max; ++i) {
			count[i] = 0;
		}
		for (int i = 0; i < size; i++) {
			count[array[i]]++;
		}
		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}
		for (int i = size - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}
		for (int i = 0; i < size; i++) {
			array[i] = output[i];
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
		System.out.println("Counting sort ");
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

//	public  void main(String args[]) {
//		int[] data = getIntegers(5);
//		int size = data.length;
//		countSort(data, size);
//		System.out.println("Sorted Array in Ascending Order: ");
//		printArray(data);
//	}
}
