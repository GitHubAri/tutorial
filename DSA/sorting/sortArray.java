package sorting;
import java.util.Scanner;

public class sortArray {

    public void printArray(int[] arrayData){
        for (int i = 0; i < arrayData.length; i++) {
            System.out.print(arrayData[i] + " ");
        }
    }

    public int[] sortingFun(int[] arrayData){
        int[] newArray = new int[arrayData.length];
        int j = 0; 
        for (int i = 0; i < arrayData.length; i++) {
            newArray[j] = arrayData[i];
            j++;
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int k = 0; k < newArray.length - 1; k++) {
                if (newArray[k] > newArray[k + 1]) {
                    int temp = newArray[k];
                    newArray[k] = newArray[k + 1];
                    newArray[k + 1] = temp;
                }
            }
        }
        return newArray;
    }
    
    // Driver Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers?");
        int n = sc.nextInt();
       

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter element at " + i + ": ");
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("\nInputed Array: ");

        sortArray obj = new sortArray();
        obj.printArray(arr);

        System.out.println("\nSorted Array: ");

        obj.printArray(obj.sortingFun(arr));

    }
}
