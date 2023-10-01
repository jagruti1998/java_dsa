package arrays;

public class ReverseWordString {
    public static void main(String[] args) {
        // Example input string
        String input = "Hello World";

        // Call the reverseWords method
        String reversedString = reverseWords(input);

        // Print the reversed string
        System.out.println(reversedString);
    }

    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = 0;

        while (start < arr.length) {
            while (end < arr.length && arr[end] != ' ') {
                end++;
            }

            reverse(start, end - 1, arr);
            start = end + 1;
            end = start;
        }
        return new String(arr);
    }

    private static void reverse(int l, int r, char[] arr) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
