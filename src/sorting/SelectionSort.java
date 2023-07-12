package sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = {12, 11, 5, 13, 3, 34};
        int length = arr.length;

        System.out.print("UnSorted Array: ");
        for (int i = 0; i < length; i++)//for loop is used to iterate over each element of the array and print them one by one.
            System.out.print(arr[i] + " ");//It prints the elements of the unsorted array.

        for (int i = 0; i < length - 1; i++) {//the last element will automatically be in its sorted position after length - 1 iterations.
            int min_index = i;
            for (int j = i + 1; j < length; j++) {//is used to find the minimum element in the unsorted portion of the array.
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }


            System.out.println();
            System.out.print("Sorted Array: ");
            for (int i = 0; i < length; i++)//for loop is used to iterate over each element of the array and print them one by one.
                System.out.print(arr[i] + " ");
        }
    }



