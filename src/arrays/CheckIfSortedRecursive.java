package arrays;

public class CheckIfSortedRecursive {
    public static void main(String[] args){
        int arr[]={1,2,3,487,55,78};
        boolean res=isSorted(arr,0);//index 0 start point
        System.out.println(res);
    }

    private static boolean isSorted(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        boolean res=isSorted(arr,i+1);
        return res;
    }
}
