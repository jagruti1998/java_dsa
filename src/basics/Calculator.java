package basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String yn;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first num:");
            int n1 = sc.nextInt();
            System.out.println("Enter second num:");
            int n2 = sc.nextInt();
            System.out.println("Enter symbool(+,-,*,/)");
            String sym = sc.next();

            int result;
            switch (sym) {
                case "+":
                    result = n1 + n2;
                    System.out.println("Addition is:" + result);
                    break;

                case "-":
                    result = n1 - n2;
                    System.out.println("Subtraction is:" + result);
                    break;

                case "*":
                    result = n1 * n2;
                    System.out.println("Multiplication is:" + result);
                    break;

                case "/":
                    result = n1 / n2;
                    System.out.println("Division is:" + result);
                    break;

                default:
                    System.out.println("Invalid symbol");
                    break;
            }

            System.out.println("Do you want to continue(Press y or n)");
            yn = sc.next();
        }
        while (yn.equals("y") || yn.equals("Y"));
    }
}
