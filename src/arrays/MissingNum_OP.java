package arrays;

public class MissingNum_OP {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int expectedSum = (n * (n + 1)) / 2;
            int actualSum = 0;
            for (int num : nums) {
                actualSum += num;
            }
            return expectedSum - actualSum;
        }

        public static void main(String[] args) {
            int[] nums = {0, 1, 3, 4, 5}; // Example array
            MissingNum_BF mn=new MissingNum_BF();
            int missingNumber = mn.missingNumber(nums);
            System.out.println("Missing number: " + missingNumber);
        }
    }

