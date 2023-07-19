package arrays;
import java.util.*;

public class SingleNumber {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int result = singleNumber(nums);
            System.out.println("The single non-repeating element is: " + result);
        }

        public static int singleNumber(int[] nums) {
            HashMap<Integer, Integer> result = new HashMap<>();
            for (int num : nums) {
                result.put(num, result.getOrDefault(num, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
            return -1; // If no non-repeating element is found, you can handle this case as per your requirement.
        }
    }

