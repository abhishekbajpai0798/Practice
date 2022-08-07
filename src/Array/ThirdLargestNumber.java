package Array;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int arr[]={1,3,5,9,4,6};
        int fl=arr[0];
        int sl=0;
        int tl=0;
        for (int i=1; i< arr.length; i++){
            if(arr[i]>fl){
                fl=arr[i];
            }
        }
        for (int i=0; i< arr.length; i++){
            if(arr[i]>sl && arr[i]<fl){
                sl=arr[i];
            }
        }
        for (int i=0; i< arr.length; i++){
            if(arr[i]>tl && arr[i]<sl){
                tl=arr[i];
            }
        }
        System.out.println(tl);
    }
}
