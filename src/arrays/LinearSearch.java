package arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int[] arr, int n, int num) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int num = scanner.nextInt();

        int val = search(arr, n, num);

        if (val != -1) {
            System.out.println("Number found at index: " + val);
        } else {
            System.out.println("Number not found.");
        }
    }
}
