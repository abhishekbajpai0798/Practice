package Recursion;

public class SumUsingRec {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans=sum(arr,0);
        System.out.println(ans);
    }
    public static int sum(int arr[], int i){
        int size= arr.length;
        if(i==size){
            return 0;
        }
        return arr[i]+sum(arr, i+1);
    }
}
