package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicatesInArray {

    public static void main(String[] args){
        int nums[]={4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicate(nums);

        if (result.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicates found: " + result);
        }
    }

    public static List<Integer> findDuplicate(int nums[]){
        HashSet<Integer> set=new HashSet<>();
        List<Integer> duplicates=new ArrayList<>();

        for(int num:nums){
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
