package TwoPointer;
//Note: two sum approach using two pointer is only works in sorted array.
public class TwoSum {
    public static void main(String[] args) {
        int arr[]= {2,5,6,7,8,9,10,11,12};
        int target=16;
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            System.out.println(start + " "+ end);
            if(arr[start]+arr[end]==target){
                System.out.println("ans: "+start + " " +end);
                return;
            }
            else if(arr[start]+arr[end]>target) {
                end--;
            }else{
                start++;
            }
        }
    }
}
