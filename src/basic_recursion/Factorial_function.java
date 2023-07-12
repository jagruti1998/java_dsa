package basic_recursion;
//iterative
public class Factorial_function {
        static int factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
        public static void main(String[] args) {

            int n = 5;
            int fact = factorial(n);
            System.out.println("The factorial of " + n + " is " + fact);
        }

}
