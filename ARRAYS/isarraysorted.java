package ARRAYS;

public class isarraysorted {
    static boolean isSorted(int arr[],int n){
        for(int i =1;i<n;i++){
            if(arr[i]>arr[i-1]){
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {
            1,3,5,7,11,10
        };
       System.out.println(isSorted(arr,6));
    }
}
