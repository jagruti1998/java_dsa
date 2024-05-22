package lowes;

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
            int j = 0;

            // Count the number of non-zero elements
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    j++;
                }
            }

            // Fill the remaining elements with zeros
            while (j < n) {
                nums[j++] = 0;
            }
        }
    }



