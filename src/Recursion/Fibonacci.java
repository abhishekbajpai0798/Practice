package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int num=8;
        System.out.println(fib(num));
    }
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
