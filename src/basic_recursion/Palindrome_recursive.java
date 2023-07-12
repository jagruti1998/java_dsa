package basic_recursion;

public class Palindrome_recursive {
        public static boolean isPalindrome(String s) {
            return isPalindromeHelper(s, 0, s.length() - 1);
        }

        private static boolean isPalindromeHelper(String s, int start, int end) {
            // Base case: if the start index crosses the end index, it is a palindrome
            if (start >= end) {
                return true;
            }

            // Check if the characters at the start and end indices are the same
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            // Recursive call: check if the substring from start+1 to end-1 is a palindrome
            return isPalindromeHelper(s, start + 1, end - 1);
        }

        public static void main(String[] args) {
            String word = "level";
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }
