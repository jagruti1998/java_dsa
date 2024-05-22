package lowes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicatesInArray {

    public static void main(String[] args){
        int arr[]={4,3,2,7,8,2,3,1};
        List<Integer> duplicates=findDuplicates(arr);
        System.out.println(duplicates);


    }

    public static List<Integer> findDuplicates(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        List<Integer> duplicates=new ArrayList<>();

        for(int num:arr){
            if(set.contains(num)){
                duplicates.add(num);
            }
            else {
                set.add(num);
            }

        }

        return duplicates;
    }
}
