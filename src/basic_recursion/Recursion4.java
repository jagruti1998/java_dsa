package basic_recursion;
//print name n times
import java.util.Scanner;

public class Recursion4 {
    public static void printName(String name, int n) {
        if (n <= 0) {
            return;
        }

        System.out.println(name);
        printName(name, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the number of times to print: ");
        int count = scanner.nextInt();

        printName(name, count);
    }
}
