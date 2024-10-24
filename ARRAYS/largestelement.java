 package ARRAYS;

class largestelement {

    static int largestElement(int arr[],int n){
        int largest = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
     int [] arr = { 1,4,5,3,2,6,7,8,0};
     System.out.println(largestElement(arr, 9));
    }
}