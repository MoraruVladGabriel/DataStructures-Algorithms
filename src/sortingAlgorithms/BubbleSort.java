package sortingAlgorithms;
/*
- In-place algorithm (which means, we don't have to create another array)
- O(n^2) time complexity - quadratic
- Algorithm degrades quickly
- It's a Stable Sort
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        bubbleSort(intArray);

        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }

    public static void bubbleSort(int[] array){
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
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
