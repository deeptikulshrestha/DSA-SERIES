import java.util.ArrayList;

public class intersection {
    static void findintersection(int arr1[],int arr2[],int n,int m){
        int i = 0;
        int j= 0;
        ArrayList <Integer> inter = new ArrayList<Integer>();
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }

            else if(arr2[j]<arr1[i]){
                j++;
            }

            else{
            inter.add(arr1[i]);
            i++;
            j++;
            }
        }
        System.out.println(inter);

    }
    public static void main(String[] args) {
        int [] one = {1,2,3,4,1,4,5,6};
        int [] two  = {2,4,1,3,5,4,21,3};
        findintersection(one, two, 8, 8);
    }
}
