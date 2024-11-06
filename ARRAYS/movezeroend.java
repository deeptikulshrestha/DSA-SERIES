package ARRAYS;
import java.util.ArrayList;
import java.util.Arrays;

public class movezeroend {
    static void movendzero(int arr[],int n){
        ArrayList<Integer> temp = new ArrayList<Integer>();
       for(int i = 0;i<n;i++){
        if(arr[i]!=0){
            temp.add(arr[i]);
        }
       }
       int tz = temp.size();
       Integer[] arr1 = temp.toArray(new Integer[0]);
       for(int i = 0;i<tz;i++){
        arr[i] = arr1[i];
       }
       for(int i = tz;i<n;i++){
        arr[i] = 0;
       }
        
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,0,2,4,0,8,4,0,2};
        movendzero(arr, 15);
    }
}
