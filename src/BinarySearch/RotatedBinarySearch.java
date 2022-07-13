package BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[]={120,130,40,60,90,100,110};
        int target=120;
        int hi= arr.length-1;
        int lo=0;
        while(lo<=hi){
            int mid= (lo+hi)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[lo]<=arr[mid] ) {
                //low to mid part is sorted
                if(target >= arr[lo] && target < arr[mid]){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            } else if (arr[mid] <= arr[hi]) {
                if(target > arr[mid] && target <= arr[hi]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        System.out.println("not found");
    }
}
