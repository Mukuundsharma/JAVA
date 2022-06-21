package com.mergesort;

import java.util.Scanner;

public class MergeSort {

//	public static void main(String args[]) {
//		int arr[] = getIntegers(6);
//		mergeSort(arr, 0, arr.length - 1);
//		System.out.println("Sorted array:");
//		printArray(arr);
//	}

	public void merge(int arr[], int p, int q, int r) {

		int n1 = q - p + 1;
		int n2 = r - q;
		int L[] = new int[n1];
		int M[] = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[p + i];
		for (int j = 0; j < n2; j++)
			M[j] = arr[q + 1 + j];

		int i, j, k;
		i = 0;
		j = 0;
		k = p;

		if (i < n1 && j < n2) {
			if (L[i] <= M[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = M[j];
				j++;
			}
			k++;
		}

		if (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		if (j < n2) {
			arr[k] = M[j];
			j++;
			k++;
		}
	}

	public void mergeSort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public int[] getIntegers(int arrayLength) {
		System.out.println("please enter your input:-");
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			System.out.println("Merge Sorted Array " + array[i]);
		}
		return array;
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
