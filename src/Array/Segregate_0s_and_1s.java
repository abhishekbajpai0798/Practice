package Array;

public class Segregate_0s_and_1s {
    public static void main(String[] args) {
         int arr[] = {0, 0, 1, 1, 0};
         segregate0and1(arr, arr.length);
         for (int i:arr){
             System.out.print(i);
         }
    }
    public static void segregate0and1(int[] arr, int n) {
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
            else if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }
}
