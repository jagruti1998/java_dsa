package basic_recursion;
import java.util.Scanner;
//recursive
public class Factorial_recursive {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            long fact = calculateFactorial(number);
            System.out.println("Factorial of number " + number + " is: " + fact);
        }

        private static long calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial(n - 1);
            }
        }
    }


