package Functions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,9,10,11,15,20};
        int target = 66;
        int res = binarySearch(arr,target);
        System.out.println(res);
    }
    public static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return -1;
    }
}
//Linear Search
//pass = 15
//arr = [5,6,9,10,11,15,20]
//o(n);
// sorted/unsorted


//Binary Search
//array must be sorted order()
//pass = 15
//[5,6,9,10,11,15,20]
