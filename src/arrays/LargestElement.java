package arrays;

public class LargestElement {
    public static void main (String[] args){
        int a[]={10,12,34,545,9808};
        int max=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
}            System.out.println(max);
    }

    public class SmallestElement {
        public static void main(String[] args) {
            int a[] = { 10, 12, 34, 545, 9808 };
            int min = a[0]; // Initialize min to the first element of the array

            for (int i = 0; i < a.length; i++) {
                if (a[i] < min) { // Compare for smaller values
                    min = a[i]; // Update min if a smaller element is found
                }
            }

            System.out.println("Minimum element: " + min);
        }
    }

}
