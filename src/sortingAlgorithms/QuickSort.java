package sortingAlgorithms;
/*
- Divide and conquer algorithm
- Recursive algorithm
- Uses a pivot element to partition the array into two parts
- Elements < pivot to its left, elements > pivot to ots right
- Pivot will then be in its correct sorted position
- Process is now repeated for the left array and right array
- Eventually, every element has been the pivot, so every element will be in its correct sorted position
- As with merge sort, we'll end up partitioning the array into a series of 1-element arrays
- Does this in-place algorithm (unlike merge sort)
- O(nlogn) - base 2. We're repeatedly partitioning the array into two halves
- Unstable algorithm
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    private static void quickSort(int[] intArray, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(intArray, start, end);
        quickSort(intArray, start, pivotIndex);
        quickSort(intArray, pivotIndex + 1, end);
    }

    public static int partition(int[] intArray, int start, int end) {
        int pivot = intArray[start];
        int i = start;
        int j = end;

        while (i < j) {

            //Note: empty loop body
            while (i < j && intArray[--j] >= pivot)
                if (i < j) {
                    intArray[i] = intArray[j];
                }


            //Note: empty loop body
            while (i < j && intArray[++i] <= pivot)
                if (i < j) {
                    intArray[j] = intArray[i];
                }

        }
        intArray[j] = pivot;
        return j;
    }
}
