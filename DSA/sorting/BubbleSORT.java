/*
 * Def: Bubble sort is a sorting algorithm that compares two adjacent elements and 
 * swaps them until they are in the intended order.
 * 
 * Exp: Start comparison from the index 0 to n. 
 * Compare with the next Elament. [If first element is gretter then the second, then Swap]
 * 
 * Step Execution: https://www.programiz.com/dsa/bubble-sort
 * Visualizer: https://www.cs.usfca.edu/~galles/visualization/ComparisonSort.html
 */

package sorting;

import java.util.*;

class BubbleSORT {

    // Bubble-Sort ALGORITHM Logic
    static int[] bubbleSort(int arr[]) {

        // Fetch Each Array Element
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) { // Loop for the Comparison
                if (arr[j] > arr[j + 1]) { // Compare with the next element
                    // Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr; // Return the Sorted Array
    }

    public static void main(String[] args) {

        int arr[] = { 34, 56, 10, -4, 20 };
        System.out.println("Inputed Array: " + Arrays.toString(arr));

        int arr_output[] = bubbleSort(arr); // Function Call

        System.out.print("Sorted Array: " + Arrays.toString(arr_output));
    }
}
