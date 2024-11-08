public class findmissing {
    static int missingNo(int arr[],int n){
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for(int i = 0 ;i<n-1 ; i++){
            sum2 = sum2 +arr[i];
        }
        int missingNum = sum -sum2;
        return missingNum;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(missingNo(arr, 6)); 
    }
}
