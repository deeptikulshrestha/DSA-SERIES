package ARRAYS;
import java.util.Arrays;
public class rotaterightbyd {
    static void reverse(int arr[],int start,int end){
        while(start<=end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        }
    }

static void rotatebydright(int arr[],int n , int d){
    d = d%n;
    
        reverse(arr,d+1,n-1);

        reverse(arr,0,d);
    
        reverse(arr,0,n-1);
    
    System.out.println(Arrays.toString(arr));
}
public static void main(String [] args){
    int [] arr = {1,2,3,4,5,6,7};
    rotatebydright(arr,7,3);
}
}