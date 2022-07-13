package Recursion;

public class PrintNumRecursively {
    public static void main(String[] args) {
        int n=5;
        printNum(n);
        printNum1(n);
    }
    //tail recursion
    public static void printNum1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum1(n-1);
    }

    //head recursion
    public static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }
}
