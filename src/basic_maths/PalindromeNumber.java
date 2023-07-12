package basic_maths;
import java.util.Scanner;

public class PalindromeNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            boolean isPalindrome = isPalindrome(num);

            System.out.println("Is the number a palindrome? " + isPalindrome);
        }

        public static boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }

            int original = x;
            int reversed = 0;

            while (x != 0) {
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x /= 10;
            }

            return original == reversed;
        }
    }
