package RecursiveSort;

public class bubblesort{
    static void bubble(int arr[],int n){
        if(n==1) return;
        for(int j = 0;j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        bubble(arr,n-1);
    }

    public static void main(String[] args){
        int [] arr = {1,4,2,0,23,11,30};
        int n = arr.length;
        System.out.println("Array before sorting: ");
        for(int i = 0;i<n;i++){
            System.out.print( arr[i] + " ");

        }
        System.out.println();
        bubble(arr,7);
        System.out.println("Array after sorting:");
        for(int i = 0;i<n;i++){
            System.out.print( arr[i] +" ");

        }
        System.out.println();

    }
}