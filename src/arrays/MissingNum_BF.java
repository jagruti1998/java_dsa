package arrays;

public class MissingNum_BF {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            for (int i = 0; i <= n; i++) {
                boolean found = false;
                for (int j = 0; j < n; j++) {
                    if (nums[j] == i) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return i;
                }
            }
            return -1; // If no missing number is found (should not occur if array is valid)
        }

        public static void main(String[] args) {
            int[] nums = {0, 1, 3, 4, 5}; // Example array
            MissingNum_BF mn=new MissingNum_BF();
            int missingNumber = mn.missingNumber(nums);
            System.out.println("Missing number: " + missingNumber);
        }
    }

