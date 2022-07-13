package Recursion;
import  java.util.*;
public class SayDigit {
    public static void main(String[] args) {
        String arr[]={"zero","one", "two","three","four","five","six","seven","eight","nine"};
        int n=412;
        sayDigit(n, arr);
    }

    public static void sayDigit(int n, String[] arr) {
        if(n==0){
            return;
        }
        int digit=n%10;
        String ans=arr[digit];
        n=n/10;
        sayDigit(n,arr);
        System.out.print(ans+" ");
    }
}
