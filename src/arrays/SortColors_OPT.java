package arrays;
import java.util.Arrays;

public class SortColors_OPT {
        public static void main(String[] args) {
            int[] nums = {2, 0, 2, 1, 1, 0}; // Example input array

            System.out.println("Original Array: " + Arrays.toString(nums));
            sortColors(nums);
            System.out.println("Sorted Array: " + Arrays.toString(nums));
        }

        public static void sortColors(int[] nums) {
            int low = 0;
            int high = nums.length - 1;
            int mid = 0;
            while (mid <= high) {
                if (nums[mid] == 0) {
                    int temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                    low++;
                    mid++;
                } else if (nums[mid] == 1) {
                    mid++;
                } else {
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }
            }
        }
    }
    