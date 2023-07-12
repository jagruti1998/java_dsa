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
}
