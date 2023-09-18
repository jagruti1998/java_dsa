package arrays;
//right rotate an array by k times
import java.util.Arrays;

public class RightRotateArray {

        public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            System.out.println(Arrays.toString(nums));
            reverse(nums, 0, k - 1);
            System.out.println(Arrays.toString(nums));
            reverse(nums, k, nums.length - 1);
        }

        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
     public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 2;
            new RightRotateArray().rotate(nums, k);
            System.out.println(Arrays.toString(nums));
        }
    }

