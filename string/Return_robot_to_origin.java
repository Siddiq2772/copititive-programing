package string;
//Return robot to origin** – Determine if robot movements described by a string return it to its origin.
public class Return_robot_to_origin {
    public static boolean judgeCircle(String moves) {
        int x=0,y=0;
        for (char c : moves.toCharArray()) {
            if(c=='U')
            x++;
            else if(c=='D')
            x--;
            else if(c=='L')
            y--;
            else if(c=='R')
            y++;
            else
            return false;
           
        }
        if (x==0&&y==0) {
            return true;                
        }
        return false;
    }
}
