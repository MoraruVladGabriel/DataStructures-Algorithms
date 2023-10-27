package sortingAlgorithms;

import java.nio.file.LinkPermission;

/*
- Divide and conquer algorithm
- Recursive algorithm
- Two phases: Splitting and Merging
- Splitting phase leads to faster sorting during the Merging phase
- Splitting is logical. We don't create new arrays

- Start with an unsorted array
- Divide the array into two arrays, which are unsorted. The first array is the left array, and the second array is the right array
- Split the left and right arrays into two arrays each
- Keep splitting until all the arrays have only one element each - these arrays are sorted
- Merge every left/right pair of sibling arrays into a sorted array
- After the first merge, we'll have a bunch of 2-element sorted arrays
- Then merge those sorted arrays (left/right siblings) to end up with a bunch of 4-element sorted arrays
- Repeat until you have a single sorted array

- Not in-place. Uses temporary arrays
- O(nlogn) - base 2. We're repeatedly dividing the array inn half during the splitting phase
- Stable algorithm
*/
public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void mergeSort(int[] intArray, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(intArray, start, mid);
        mergeSort(intArray, mid, end);
        merge(intArray, start, mid, end);
    }

    private static void merge(int[] intArray, int start, int mid, int end) {
        if (intArray[mid - 1] <= intArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = intArray[i] <= intArray[j] ? intArray[i++] : intArray[j++];
        }

        System.arraycopy(intArray, i, intArray, start + tempIndex, mid - i);

        System.arraycopy(temp, 0, intArray, start, tempIndex);
    }

}
