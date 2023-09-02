package strings;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveShortStringsFromArray {

    public static void main(String[] args) {
        String[] originalArray = {"apple", "banana", "cat", "do", "elephant", "fox", "goat"};

        String[] filteredArray = removeShortStrings(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Filtered Array: " + Arrays.toString(filteredArray));
    }

    public static String[] removeShortStrings(String[] inputArray) {
        ArrayList<String> filteredList = new ArrayList<>();

        for (String str : inputArray) {
            if (str.length() >= 3) {
                filteredList.add(str);
            }
        }

        // Convert the ArrayList back to an array
        String[] resultArray = new String[filteredList.size()];
        resultArray = filteredList.toArray(resultArray);

        return resultArray;
    }
}
