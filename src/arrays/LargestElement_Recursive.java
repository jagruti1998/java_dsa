package arrays;
import java.util.Scanner;

public class LargestElement_Recursive {
         public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of elements in the array: ");
                int n = scanner.nextInt();

                int[] arr = new int[n];
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }

                int max = findMax(arr, 0);
                System.out.println("The largest element in the array is: " + max);

                scanner.close();
            }

            public static int findMax(int arr[], int i) {
                if (i >= arr.length - 1) {
                    return arr[i];
                } else {
                    return Math.max(arr[i], findMax(arr, i + 1));
                }
            }
        }

