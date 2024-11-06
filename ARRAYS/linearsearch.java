package ARRAYS;

public class linearsearch {
    static int linearSearch(int arr[],int n,int num){
        for(int i = 0 ; i<n;i++){
            if(arr[i]==num){
                System.out.println("Element found at index i: " + i);
            };
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] arr = {1,7,8,5,3,0,2};
        System.out.println(linearSearch(arr, 7, 9));
    }

}
