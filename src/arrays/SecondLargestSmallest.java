package arrays;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 1, 7, 9, 2, 6, 4};

        int secondLargest = findSecondLargest(array);//These call two methods, passing the array as an argument.
        int secondSmallest = findSecondSmallest(array);//returned values are stored in the variables secondLargest and secondSmallest, respectively.


        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static int findSecondLargest(int[] array) {//declares a method named findSecondLargest that takes an integer array named array as a parameter and returns an integer value.

        int largest = Integer.MIN_VALUE;//declare two integer variables, largest and secondLargest, and initialize them with the minimum possible integer value.
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }

    public static int findSecondSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }

        return secondSmallest;
    }
}
