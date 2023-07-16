package arrays;
import java.util.ArrayList;
import java.util.List;
public class UnionOfTwo_OP {
        public static List<Integer> findUnion(int[] arr1, int[] arr2) {
            List<Integer> unionList = new ArrayList<>();
            int m = arr1.length;
            int n = arr2.length;
            int i = 0, j = 0;

            while (i < m && j < n) {
                if (arr1[i] < arr2[j]) {
                    unionList.add(arr1[i]);
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    unionList.add(arr2[j]);
                    j++;
                } else {
                    unionList.add(arr1[i]);
                    i++;
                    j++;
                }
            }

            while (i < m) {
                unionList.add(arr1[i]);
                i++;
            }

            while (j < n) {
                unionList.add(arr2[j]);
                j++;
            }

            return unionList;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {3, 4, 5, 6, 7};

            List<Integer> unionList = findUnion(arr1, arr2);

            System.out.println("Union of the arrays: " + unionList);
        }
    }


