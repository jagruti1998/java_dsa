package arrays;

public class MoveZerosOptimal {
     public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};

            moveZeroes(nums);

            // Print the modified array
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        public static void moveZeroes(int[] nums) {
            int n = nums.length;
            int nonZeroIndex = 0;

            // Move all non-zero elements to the beginning of the array
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[nonZeroIndex++] = nums[i];
                }
            }

            // Fill the remaining elements with zeros
            while (nonZeroIndex < n) {
                nums[nonZeroIndex++] = 0;
            }
        }
    }


