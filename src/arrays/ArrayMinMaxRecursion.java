package arrays;
import java.util.Scanner;

public class ArrayMinMaxRecursion {

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
            int min = findMin(arr, 0);

            System.out.println("The largest element in the array is: " + max);
            System.out.println("The smallest element in the array is: " + min);

            scanner.close();
        }

        public static int findMax(int arr[], int i) {
            if (i >= arr.length - 1) {
                return arr[i];
            } else {
                return Math.max(arr[i], findMax(arr, i + 1));
            }
        }

        public static int findMin(int arr[], int i) {
            if (i >= arr.length - 1) {
                return arr[i];
            } else {
                return Math.min(arr[i], findMin(arr, i + 1));
            }
        }
    }
