package arraylists;

public class MedianFinder {

    public static double findMedian(int[] arr1, int[] arr2) {
        int totalLength = arr1.length + arr2.length;
        int[] merged = new int[totalLength];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        if (totalLength % 2 == 0) {
            int mid1 = merged[totalLength / 2 - 1];
            int mid2 = merged[totalLength / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return merged[totalLength / 2];
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        double median = findMedian(array1, array2);
        System.out.println("Median: " + median);
    }
}

