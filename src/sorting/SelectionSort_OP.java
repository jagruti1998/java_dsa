
package sorting;

public class SelectionSort_OP {
    public static void main(String[] args) {
        int arr[] = {12, 11, 5, 13, 3, 34};
        int length = arr.length;

        System.out.print("Unsorted Array: ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

        for (int i = 0; i < length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            if (min_index != i) {//i.e., if min_index is equal to i,we can avoid the swap operation since the element is already in its sorted position.
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println();
        System.out.print("Sorted Array: ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }
}
