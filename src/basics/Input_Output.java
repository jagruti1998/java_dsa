package basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args)
    {
        //take input from user
        Scanner sc=new Scanner(System.in);//imports scanner class in util package
        System.out.println("Enter Name:");
        String name=sc.next();//provide input as string and next is scanner class method

        System.out.println("Enter gender");
        char gender=sc.next().charAt(1);//provide input as character

        System.out.println("Enter age:");
        int age=sc.nextInt();//provide input as int

        System.out.println("Enter phone number");
        long phno=sc.nextLong();//provide input as long

        //print all the values
        System.out.println("name:"+name);

    }

}
