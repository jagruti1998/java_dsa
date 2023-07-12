package basics;

import java.util.Scanner;

public class GreaterTwo {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int greaterNumber = Math.max(num1, num2);

        System.out.println("The greater number is: " + greaterNumber);
    }
        }


