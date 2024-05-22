package lowes;


import java.util.Arrays;

public class ReplaceRepeatedNumber {
    public static void main(String[] args) {
        int[] arr = {22, 4, 6, 8, 22};
        int k = 22;

        replaceRepeatedNumber(arr, k);

        // Print the modified array
        System.out.println("Modified array: " + Arrays.toString(arr));
    }

    public static void replaceRepeatedNumber(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                arr[i] = 1;
            }
        }
    }
}
