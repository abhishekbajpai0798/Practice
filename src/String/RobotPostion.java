package String;

public class RobotPostion {
    public static void main(String[] args) {
        String move = "UDDLLRUUUDUURUDDUULLDRRRR";
        finalPosition(move);
    }
    public static void finalPosition(String move){
        int len =move.length();
        int x = 0;
        int y = 0;
        for (int i=0; i<len; i++){
            char step = move.charAt(i);
            if(step == 'U'){
                y++;
            }
            else if(step == 'D'){
                y--;
            }
            else if(step == 'L'){
                x--;
            }
            else{
                x++;
            }
        }
        System.out.println("final step of robot is: "+ "("+ x+","+y+")");
    }

}
