package lowes;

import java.util.HashSet;

public class LongestSubstringWithoutRepeated {

    public static void main(String[] args) {
        String s = "abcabcbb";

        int length = lengthOfLongestSubstring(s);
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0; // If the string is empty or null, there are no substrings.
        }

        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0, right = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return max;
    }
}
