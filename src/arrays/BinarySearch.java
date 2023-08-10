package arrays;
import java.util.Scanner;
//Binary search in an array
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        Solution2 solution = new Solution2();
        int result = solution.search(nums, target);

        if (result != -1) {
            System.out.println("Target element found at index: " + result);
        } else {
            System.out.println("Target element not found in the array.");
        }

        scanner.close();
    }
}

class Solution2 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
