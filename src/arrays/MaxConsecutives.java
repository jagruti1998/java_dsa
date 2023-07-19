package arrays;

public class MaxConsecutives {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxCount = 0;
            int count = 0;

            for (int num : nums) {
                if (num == 1) {
                    count++;
                    maxCount = Math.max(count, maxCount);
                } else {
                    count = 0;
                }
            }
            return maxCount;
        }

        public static void main(String[] args) {
            int[] nums = {1, 1, 0, 1, 1, 1}; // Example array
            MaxConsecutives mc = new MaxConsecutives();
            int maxConsecutiveOnes = mc.findMaxConsecutiveOnes(nums);
            System.out.println("Maximum number of consecutive ones: " + maxConsecutiveOnes);
        }
    }
    //The time complexity of this solution is O(n), where n is the length of the input array nums. It traverses the array once to find the maximum number of consecutive ones.