/*
 * Def: Selection sort is a sorting algorithm that selects the smallest element from an 
 * unsorted list in each iteration and places that element at the beginning of the unsorted list.
 * 
 * Step Execution: https://www.programiz.com/dsa/selection-sort
 * Visualizer: https://www.cs.usfca.edu/~galles/visualization/ComparisonSort.html
 */

package sorting;

import java.util.*;

public class SelectionSORT {

    // Selection-Sort ALGORITHM Logic
    static int[] selectionSort(int arr[]) {
        
        // Fetch Each Array Element
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i; // Assuming the Minimum Element
            for (int j = i + 1; j < arr.length; j++) // Compare with other elements
                if (arr[j] < arr[index]) // Fetch the Minimum Value
                    index = j; // Update the asumened Min value index

            // Swapping
            int swap = arr[i];
            arr[i] = arr[index];
            arr[index] = swap;
        }

        return arr; // Return the Sorted Array
    }

    public static void main(String[] args) {

        int arr[] = { 34, 56, 10, -4, 20 };
        System.out.println("Inputed Array: " + Arrays.toString(arr));

        int arr_output[] = selectionSort(arr); // Function Call

        System.out.print("Sorted Array: " + Arrays.toString(arr_output));
    }
}
