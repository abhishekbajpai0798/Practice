package Recursion;

public class ReachHome {
    public static void main(String[] args) {
        int src=1;
        int dest=10;
        reachHome(1,10);
    }
    public  static void reachHome(int src, int dest){
        if(src==dest){
            System.out.println("Reach home");
            return;
        }
        reachHome(src+1,dest);
    }
}
