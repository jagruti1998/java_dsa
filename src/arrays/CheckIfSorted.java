package arrays;

public class CheckIfSorted {
    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 12, 5, 4, 54};
        System.out.println(isSorted(arr));
    }

}

