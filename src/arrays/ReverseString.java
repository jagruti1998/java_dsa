package arrays;

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]){
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();

        char[] charArray=input.toCharArray();

        reverseString(charArray);

        System.out.println("Reversed String:" +new String (charArray));

    }

    public static void reverseString(char s[]){

        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left++]=s[right];
            s[right--]=temp;
        }


    }
}
