package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,8,9,10};
        int tar=6;
        boolean ans=binarySearch(arr,tar,0,arr.length-1);
        System.out.println(ans);
    }

    private static boolean binarySearch(int[] arr, int tar,int s,int e) {

       if(s<=e){
           int mid=s+(e-s)/2;
           if(arr[mid]==tar){
               return true;
           }
           if(arr[mid]<tar){
               return binarySearch(arr,tar,mid+1,e);
           }
            return binarySearch(arr,tar,s,mid-1);
       }
       return false;
    }
}
