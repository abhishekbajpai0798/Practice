public class FibonacciItrative {
    public static void main(String[] args) {
        int n=8;
        int a=0;
        int b=1;
        for(int i=2; i<=n; i++){
            int sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+ " ");
        }
        System.out.println();
        System.out.println(b);
    }
}
