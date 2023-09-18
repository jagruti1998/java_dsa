package arrays;

import java.util.Arrays;

public class SecondSmallestUsingJava8 {


    public static void findSmallest(int arr[]){
        int secondSmallest= Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("Array does not have a second smallest element"));
        System.out.println(secondSmallest);
    }

    public static void main(String[] args){
        int num[]={2, 5, 1, 3 , 6};
        findSmallest(num);
    }
}
