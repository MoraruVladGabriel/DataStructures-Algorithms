package sortingAlgorithms;
/*
- In-place algorithm
- O(n^2) time complexity - quadratic
- Stable algorithm
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(intArray);

        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }

    public static void insertionSort(int[] intArray){
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
    }
}
