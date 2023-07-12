package sorting;

public class BubbleSort_OP {
    public static void main(String[] args) {
            int arr[] = {31, 12, 3, 5, 23, 65, 4};
            int length = arr.length;

            System.out.print("Unsorted Array: ");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i] + " ");
            }

            boolean swapped;
            for (int i = 0; i < length - 1; i++) {
                swapped = false;
                for (int j = 0; j < length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                // If no swaps were made in this pass, the array is already sorted.
                if (!swapped) {
                    break;
                }
            }

            System.out.println();
            System.out.print("Sorted Array: ");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

