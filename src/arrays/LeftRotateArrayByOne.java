package arrays;

public class LeftRotateArrayByOne {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        rotate(a);
        System.out.println("after rotation");
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }


    public static void rotate(int a[]){
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];

        }
        a[a.length-1]=temp;
    }
}
