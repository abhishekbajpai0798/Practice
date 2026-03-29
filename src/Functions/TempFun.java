package Functions;

import java.util.Arrays;

public class TempFun {
    static{
        System.out.println("static bock1");
    }
    static{
        System.out.println("static bock2");
    }
    public static void main(String[] args) {
        System.out.println("main");
        display();
        String str = greet();
        System.out.println(str);
        int val = sum();
        int a=10;
        int b=2;
        mul(a,b);

        int arr[] = {1,2,3,4,5};
        int res = sumArr(arr);
        System.out.println(res);

        int[] eveRes =  findEven(arr);
        System.out.println(Arrays.toString(eveRes));


    }
    public static void display(){
        System.out.println("Display");
    }
    public static String greet(){
        //code
        return "Hello";
    }
    public static int sum(){
        //code
        int a=10;
        int b=20;
        return a+b;
    }
    public static int mul(int x, int y){
        //code
        return x*y;
    }

    public static int sumArr(int[] arr){
        int res=0;
        for(int a:arr){
             res += a;
        }
        return res;
    }

    public static int[] findEven(int[] arr){
        int[] res=new int[5];
        for(int i=0; i<5; i++){
            if(arr[i]%2 == 0){
                res[i]=arr[i];
            }
        }
        return res;
    }
}
