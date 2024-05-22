package lowes;

import java.util.HashMap;

public class MaxCountOfN {
    public static void main(String[] args) {
        int M = 245769;
        int maxCount = maxCountOfN(M);
        System.out.println("Max count of N: " + maxCount);
    }

    public static int maxCountOfN(int M) {
        // Step 1: Count the frequency of each digit in M
        HashMap<Integer, Integer> digitCount = new HashMap<>();
        while (M > 0) {
            int digit = M % 10;
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
            M /= 10;
        }

        // Step 2: Adjust the frequencies of digits 2 and 5
        int count2 = digitCount.getOrDefault(2, 0);
        int count5 = digitCount.getOrDefault(5, 0);
        int adjustedCount25 = (count2 + count5) / 2;

        // Step 3: Adjust the frequencies of digits 6 and 9
        int count6 = digitCount.getOrDefault(6, 0);
        int count9 = digitCount.getOrDefault(9, 0);
        int adjustedCount69 = (count6 + count9) / 2;

        // Step 4: Return the minimum frequency of the adjusted digits
        return Math.min(adjustedCount25, adjustedCount69);
    }
}
