package stack;

import java.util.Scanner;
import java.util.Stack;

public class MinimumStack {
    int min = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<Integer>();

        public void push(int x) {
            if (x <= min) {
                stack.push(min);
                min = x;
            }
            stack.push(x);
        }

        public void pop() {
            if (stack.pop() == min) {
                min = stack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }

        public static void main(String[] args) {
            MinimumStack minStack = new MinimumStack();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Choose an operation:");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Top");
                System.out.println("4. Get Min");
                System.out.println("5. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the value to push: ");
                        int value = scanner.nextInt();
                        minStack.push(value);
                        break;
                    case 2:
                        minStack.pop();
                        System.out.println("Top element popped.");
                        break;
                    case 3:
                        int top = minStack.top();
                        System.out.println("Top element: " + top);
                        break;
                    case 4:
                        int min = minStack.getMin();
                        System.out.println("Minimum element: " + min);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please choose a valid option.");
                        break;
                }
            }
        }
    }


