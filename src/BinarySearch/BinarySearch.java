package BinarySearch;
// Array should be sorted
//TC: O(log n)

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={5,9,12,15,24,26,35,39,40};
        int start=0;
        int end=arr.length-1;
        int target=9;
        while (start<=end){
            int mid=start+(end-start);
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
}
