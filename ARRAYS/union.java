import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class union {

    static void findUnion(int arr1[],int arr2[],int n,int m){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        for(int i =0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        for(int it:set){
            union.add(it);
        }
        System.out.println(union);
        }

        public static void main(String[] args) {
            int [] one = {1,2,3,4,2,1,4,5,6};
            int [] two  = {2,4,1,3,5,4,21,3};
            findUnion(one, two, 9, 8);
        }
    }
