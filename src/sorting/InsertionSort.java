package sorting;

public class InsertionSort {//optimize solution
    public static void main(String[] args) {

        int arr[]={12,11,5,13,3,34};
        int length= arr.length;

        System.out.print("UnSorted Array: ");
        for (int i=0;i<length;i++)
            System.out.print(arr[i] +" ");

        for(int i=1;i<length;i++) //loop iterates over the array starting from the second element (index 1) up to the last element.
        {
            int temp=arr[i]; //comparison and assigning between elements
            int j=i-1;//initializes the variable j as the index of the previous element.

            while(j>=0 && arr[j]>temp)//compares the current element with the previous elements and shifts them to the right if they are greater than temp.
            {
                arr[j+1]=arr[j];//This line shifts the element at index j to the right.
                j=j-1;//decrements the value of j to compare the current element with the next previous element.
            }
            arr[j+1]=temp;//assigns the value of temp to the correct position in the sorted part of the array.
        }

        System.out.println();
        System.out.print("Sorted Array: ");
        for (int i=0;i<length;i++)
            System.out.print(arr[i] +" ");
    }

}
