package arraylists;


public class MedianArray {

    public static float medianFinder(int[] arr1,int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] m = new int[arr1.length + arr2.length];//new array declaration to merge both the arrays with their array size

        while (i < arr1.length && j < arr2.length && k <= m.length/2){
            if (arr1[i] < arr2[j]) {
                m[k] = arr1[i];
                i++;
                k++;
            }
            else {
                m[k] = arr1[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length && k <=m.length/2){
            m[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length && k <=m.length/2){
            m[k] = arr2[j];
            j++;
            k++;
        }

        //array is merged till here
        //now to find the median of an array lets find out the array is odd or even

        if (m.length % 2 == 0) {
            int mid = m.length / 2;
            return (float) (m[mid] + m[mid - 1]) / 2;

        }
        else {
            int mid = m.length / 2;
            return m[mid];

        }

    }

    public static void main(String args[])
    {
        int arr1[]={1,3,5,8};
        int arr2[]={5,6,7,19,21,25};

        System.out.println(medianFinder(arr1,arr2));
    }
}

