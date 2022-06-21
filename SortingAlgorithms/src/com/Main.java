package com;

import com.bubblesort.BubbleSort;
import com.countingsort.*;
import com.insertionsort.InsertionSort;
import com.mergesort.MergeSort;
import com.quicksort.*;

public class Main {

	public static void main(String[] args) {
		CountingSort c = new CountingSort();
		int[] data = c.getIntegers(5);
		int size = data.length;
		c.countSort(data, size);
		System.out.println("Sorted Array in Ascending Order: ");
		c.printArray(data);

		BubbleSort b = new BubbleSort();
		int[] array = b.getIntegers(7);
		b.bubbleSort(array);
		b.printArray(array);

		MergeSort m = new MergeSort();
		int[] arrayFirst=m.getIntegers(5);
		m.mergeSort(arrayFirst, 0, arrayFirst.length);
		m.printArray(arrayFirst);

		Quicksort q = new Quicksort();
		q.quickSort(array, 0, array.length - 1);
		q.printArray(array);

		InsertionSort i = new InsertionSort();
		int[] arr = i.getIntegers(6);
		i.insertionSort(arr);
		i.printArray(arr);

	}

}
