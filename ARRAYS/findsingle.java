public class findsingle {
    static int single(int arr[],int n){
        int xor = 0;
        for(int i = 0;i<n;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,4,5,5};
        System.out.println(single(arr, 7));
    }
}
