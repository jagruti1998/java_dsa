package patterns;

import java.util.Scanner;

public class StarPattern2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");                     /*    ***
                                                                               **
                                                                               *      */
        int r=sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
