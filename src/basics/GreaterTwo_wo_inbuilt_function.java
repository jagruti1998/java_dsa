package basics;

import java.util.Scanner;

public class GreaterTwo_wo_inbuilt_function {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();

        System.out.println("Enter second number:");
        int num2=sc.nextInt();

        int greaternum;

        if(num1>num2){
            greaternum=num1;
        }
        else
        {
            greaternum=num2;
        }

        System.out.println("Greatest of two number is:" +greaternum);

    }
}
