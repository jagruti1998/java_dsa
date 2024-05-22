package lowes;

import java.util.HashSet;

public class UniqueStringPrinter {


    public static void printUniqueStrings(String[] strings) {
        HashSet<String> seenStrings = new HashSet<>();
        for (String str : strings) {
            if (!seenStrings.contains(str)) {
                seenStrings.add(str);

                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        String[] input = {"apple", "banana", "orange", "apple", "grape", "banana"};
        printUniqueStrings(input);
    }
}