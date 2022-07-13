package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={2,8,7,15,45,6,74};
        int target=74;
        int res=linarSeach(arr,target,0);
        System.out.println(res);
    }
    public static int linarSeach(int arr[], int x, int idx){
        if(idx== arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        return linarSeach(arr,x,idx+1);
    }
}
