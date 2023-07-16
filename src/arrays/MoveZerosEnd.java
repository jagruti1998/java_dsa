package arrays;

public class MoveZerosEnd {
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
            int count = 0;

            // Count the number of non-zero elements
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[count++] = nums[i];
                }
            }

            // Fill the remaining elements with zeros
            while (count < n) {
                nums[count++] = 0;
            }
        }
    }



