package com.bubblesort;

import java.util.Scanner;

public class BubbleSort {

	public void bubbleSort(int array[]) {
		int size = array.length;

		for (int i = 0; i < size - 1; i++)
			for (int j = 0; j < size - i - 1; j++)
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
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

//	public  void main(String args[]) {
//
//		int[] data = getIntegers(5);
//		bubbleSort(data);
//		System.out.println("Sorted Array in Ascending Order:");
//		printArray(data);
//	}
}
