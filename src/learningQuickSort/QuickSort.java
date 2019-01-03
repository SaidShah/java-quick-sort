package learningQuickSort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int inputArray[] = { 12, 8, 74, 43, 0, 1098, 93, 15, 888, 456, 985, 6, 85, 456, 32, 95, 999 };
		quickSort(inputArray, 0, inputArray.length-1);
		System.out.println(Arrays.toString(inputArray));

	}

	public static void quickSort(int tempArray[], int start, int end) {

		if (start < end) {
			int middleIndex = partition(tempArray, start, end);// index position of the correctly placed value in the
																// array
			quickSort(tempArray, start, middleIndex - 1);// to sort the left side of the array and the middleIndex is
															// already sorted
			quickSort(tempArray, middleIndex + 1, end);// to sort the right side of the array and the middleIndex is
														// already sorted

		}

	}

	public static int partition(int tempArray[], int start, int end) {

		int initialIndex = start - 1;// this is the index to be initialized once first value is found, it starts from -1
										
		int pivot = tempArray[end];// the pivot value which is at the end of the array
		for (int j = start; j <= end-1; j++) {
			if (tempArray[j] <= pivot) {
				initialIndex++;
				int initialIndexValue = tempArray[initialIndex];// next 4 lines of code are swapping values
				int jIndexValue = tempArray[j];
				tempArray[initialIndex] = jIndexValue;
				tempArray[j] = initialIndexValue;
			}
		}
		// now put the pivot value in the correct spot
		int initialIndexValue = tempArray[initialIndex + 1];
		tempArray[end] = initialIndexValue;
		tempArray[initialIndex +1] = pivot;// here is where the pivot value is placed in the correct place in the array
		return initialIndex + 1;
	}


}
