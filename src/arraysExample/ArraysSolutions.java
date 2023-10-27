package arraysExample;
/*
-Contiguous block in memory
-Every element occupies the same amount of space in memory
-If an array starts at memory address x, and the size of each element in the array is y,
    we can calculate the memory address of the ith element by using the following expression: x+i*y
-If we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array

Example:

    Array: 20, 35, -15, 7, 55, 1, -22
    Start address of array = 12 (suppose), element size = 4 bytes (bcs it is an array in integers, and an integer have 4 bytes)

    Address of array[0]=12
    Address of array[1]=12+(1*4)=16
    Address of array[2]=12+(2*4)=20
    Address of array[3]=12+(3*4)=24
    Address of array[4]=12+(4*4)=28
    Address of array[5]=12+(5*4)=32
    Address of array[6]=12+(6*4)=36

Time complexity for arrays operations:

    Retrieve with index : O(1) - constant time
    Retrieve without index : O(n) - linear time
    Add an element to a full array : O(n)
    Add an element to the end of an array (has space) : O(1)
    Insert or update an element at a specific index : O(1)
    Delete an element by setting it to null : O(1)
    Delete an element by shifting elements : O(n)
 */
public class ArraysSolutions {
    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}
