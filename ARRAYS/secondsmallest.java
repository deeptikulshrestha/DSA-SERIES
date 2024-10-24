package ARRAYS;

/**
 * secondsmallest
 */
public class secondsmallest {
    static void secondSmallest(int arr[],int n){
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for(int i = 1 ; i<n ; i++){
            if(arr[i]<smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]>smallest && arr[i]<sSmallest){
                sSmallest = arr[i];
            }
        }
        System.out.println(sSmallest);

    }
    public static void main(String[] args) {
        int [] arr = {
            1,3,5,7,9,10
        };
       secondSmallest(arr, 6);
    }
} 
    

