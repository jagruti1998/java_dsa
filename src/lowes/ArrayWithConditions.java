package lowes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayWithConditions {
    public static void main(String[] args){
        int arr[]={5,10,30,7,8,4};
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();

        for(int num: arr){
            if(num%10==0)
                list1.add(num);
            else if(num%2==0)
                list2.add(num);
            else
                list3.add(num);
        }
        Collections.sort(list1,Collections.reverseOrder());
        for(int i=list2.size()-1;i>=0;i--)
            list1.add(list2.get(i));
        list1.addAll(list3);

        System.out.println(list1);

    }
}
