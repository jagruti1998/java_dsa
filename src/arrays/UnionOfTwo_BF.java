package arrays;
import java.util.Arrays;

public class UnionOfTwo_BF {
        public static int[] union(int[] arr1, int[] arr2) {
            int m = arr1.length;
            int n = arr2.length;
            int[] result = new int[m + n];

            int i = 0, j = 0, k = 0;
            while (i < m && j < n) {
                if (arr1[i] < arr2[j]) {
                    result[k++] = arr1[i++];
                } else if (arr2[j] < arr1[i]) {
                    result[k++] = arr2[j++];
                } else {
                    result[k++] = arr1[i++];
                    j++;
                }
            }

            while (i < m) {
                result[k++] = arr1[i++];
            }

            while (j < n) {
                result[k++] = arr2[j++];
            }

            return Arrays.copyOf(result, k);
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {3, 4, 5, 6, 7};

            int[] unionArray = union(arr1, arr2);

            System.out.println("Union of the arrays: " + Arrays.toString(unionArray));
        }
    }


