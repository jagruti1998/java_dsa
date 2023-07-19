package arrays;
import java.util.Arrays;
//BRUTEFORCE
public class SortColors_BF {
     public static void main(String[] args) {
            int[] nums = {2, 0, 2, 1, 1, 0}; // Example input array

            System.out.println("Original Array: " + Arrays.toString(nums));
            sortColors(nums);
            System.out.println("Sorted Array: " + Arrays.toString(nums));
        }

        public static void sortColors(int[] nums) {
            int c0 = 0;
            int c1 = 0;
            int c2 = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) c0++;
                else if (nums[i] == 1) c1++;
                else if (nums[i] == 2) c2++;
            }
            for (int i = 0; i < c0; i++) {
                nums[i] = 0;
            }
            for (int i = c0; i < c0 + c1; i++) {
                nums[i] = 1;
            }
            for (int i = c0 + c1; i < nums.length; i++) {
                nums[i] = 2;
            }
        }
    }

