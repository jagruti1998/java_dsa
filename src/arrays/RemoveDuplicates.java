package arrays;

public class RemoveDuplicates {

        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 6};
            int length = removeDuplicates(arr);
            System.out.println("Length after removing duplicates: " + length);
            System.out.print("Array without duplicates: ");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static int removeDuplicates(int[] arr) {
            int i = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    arr[i + 1] = arr[j];
                    i++;
                }
            }
            return i + 1;
        }
    }

