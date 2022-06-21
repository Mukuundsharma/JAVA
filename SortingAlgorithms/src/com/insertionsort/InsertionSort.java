package com.insertionsort;

import java.util.Scanner;

public class InsertionSort {
//	public static void main(String args[]) {
//		int[] data = getIntegers(5);
//		insertionSort(data);
//		System.out.println("Sorted Array in Ascending Order: ");
//		printArray(data);
//	}

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
	
	public void printArray(int[] array) {
		System.out.println("Printing my array ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
		System.out.println(" ");
	}

	public void insertionSort(int array[]) {
		int size = array.length;
		for (int step = 1; step < size; step++) {
			int key = array[step];
			int j = step - 1;
			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				--j;
			}
			array[j + 1] = key;
		}
	}
	
}