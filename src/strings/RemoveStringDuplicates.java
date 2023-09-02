package strings;

public class RemoveStringDuplicates {

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "banana", "cherry", "date", "date", "date", "fig"};
        int length = removeDuplicates(arr);
        System.out.println("Length after removing duplicates: " + length);
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(String[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (!arr[i].equals(arr[j])) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}
