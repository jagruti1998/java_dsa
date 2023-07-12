package sorting;

public class BubbleSort { //implementation
    public static void main(String[] args) {
        int arr[]={31,12,3,5,23,65,4};//an array is declared and initialized with some values.

        int length= arr.length;//The variable length is declared and assigned the length of the array arr.
        System.out.print("UnSorted Array: ");
        for (int i=0;i<length;i++)//for loop is used to iterate over each element of the array and print them one by one.
            System.out.print(arr[i] +" ");

        for(int i=0;i<length;i++){//The nested for loop iterates over each element of the array using the variable i.

            for(int j=1;j<length-1;j++){//another for loop is used with the variable j to compare adjacent elements of the array.

                if(arr[j-1]>arr[j]){//If condition is true, a swap is performed to bring the smaller element towards the beginning of the array.

                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;//This process continues until the inner loop completes a pass for each element of the array.
                }
            }
        }
        System.out.println();//statement is used to print a new line.

        System.out.print("Sorted Array: ");
        for (int i=0;i<length;i++)//for loop is used to iterate over the elements of the array again and print them after the sorting process.[+
            System.out.print(arr[i] +" ");
    }
}

