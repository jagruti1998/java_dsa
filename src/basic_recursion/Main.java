package basic_recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        long n = scanner.nextLong();

        countGoodNumbers solution = new countGoodNumbers();
        int result = solution.countGoodNumbers(n);
        System.out.println("Count of good numbers: " + result);
    }
}
