package basic_maths;

public class GCD1 {
        public static void main(String[] args) {
            int a = 98, b = 0;
            int gcd = calculateGCD(a, b);

            System.out.println("GCD: " + gcd);
        }

        public static int calculateGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            return a;
        }
    }


