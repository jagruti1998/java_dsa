package arrays;

public class ArrayMinMax {
public static void main(String[] args) {
        int a[] = { 10, 12, 34, 545, 9808 };

        int max = a[0]; // Initialize max to the first element of the array
        int min = a[0]; // Initialize min to the first element of the array

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i]; // Update max if a larger element is found
            }
            if (a[i] < min) {
                min = a[i]; // Update min if a smaller element is found
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
