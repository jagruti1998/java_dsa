package basic_recursion;
//print sum of first natural numbers
import java.util.Scanner;

public class Recursion3 {
    public static int printSum(int v) {
        if (v == 0)
            return 0;

        return v + printSum(v - 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int r = sc.nextInt();

        int sum = printSum(r);
        System.out.println("Sum of first " + r + " natural numbers: " + sum);
    }
}
