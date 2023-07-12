package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {//The mergeSort method takes an integer array arr as a parameter

        if (arr == null || arr.length <= 1) {//checks if the array is null or has only one element, in which case it is already sorted, and the method returns.

            return;
        }
        int n = arr.length;//n stores the length of the array
        int mid = n / 2;//mid is calculated as the midpoint of the array.


        int[] left = new int[mid];//to store the elements of the left and right halves of the original array.
        int[] right = new int[n - mid];

        // Split the array into two halves
        for (int i = 0; i < mid; i++) {//copies elements from the original array to the left array.
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {//copies elements from the original array to the right array, adjusting the index by subtracting mid to align with the index of the right array.
            right[i - mid] = arr[i];
        }

        // Recursive calls to sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 5, 13, 3, 34};

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
