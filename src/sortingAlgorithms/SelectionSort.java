package sortingAlgorithms;
/*
- In-place algorithm
- O(n^2) time complexity - quadratic
- Doesn't require as much swapping as bubble sort
- Unstable algorithm
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        selectionSort(intArray);

        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }

    public static void selectionSort(int[] intArray){
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }
    }
    public static void swap(int[] array, int i, int j){

        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
