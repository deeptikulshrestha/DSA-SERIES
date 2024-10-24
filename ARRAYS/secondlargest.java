package ARRAYS;
/**
 * secondlargest
 */
public class secondlargest {
   static int sLargest(int arr[],int n){
    int largest = arr[0];
    int sLargest = -1;
    for(int i =1;i<n;i++){
        if(arr[i]>largest){
            sLargest = largest;
            largest = arr[i];
            
        }
        else if(arr[i]<largest && arr[i]>sLargest){
            sLargest = arr[i];
        }
    }
    return sLargest;
   }


public static void main(String[] args) {
    int [] arr = {
        1,3,5,7,9,10
    };
    System.out.println(sLargest(arr, 6));

}
    
}