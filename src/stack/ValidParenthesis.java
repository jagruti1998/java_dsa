package stack;

import java.util.Scanner;
import java.util.Stack;

class ValidParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        ValidParenthesis valid = new ValidParenthesis();
        boolean isValid = valid.isValid(input);

        if (isValid) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is not valid.");
        }

        scanner.close();
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }
}
