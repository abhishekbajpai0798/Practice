package Recursion;

public class IsSortedUsingRec {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,9,12};
        boolean check=isSorted(arr,0);
        System.out.println(check);
    }

    private static boolean isSorted(int[] arr,  int i) {
        int size= arr.length-1;
        if(i==size){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        boolean res=isSorted(arr, i+1);
        return res;
    }
}
