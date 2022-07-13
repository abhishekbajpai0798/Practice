package Recursion;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int smallerProb=fact(n-1);
        int biggerProb=n*smallerProb;
        return biggerProb;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
