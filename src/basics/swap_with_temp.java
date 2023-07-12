package basics;

import java.util.Scanner;

public class swap_with_temp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers to swap:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Swapped values are: " +num1 +"  " +num2);

    }
}
