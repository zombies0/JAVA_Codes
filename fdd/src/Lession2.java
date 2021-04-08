// import java.util.Date;

import java.awt.*;

public class Lession2 {

  

    public static void main(String [] args){
        
        /*

        byte age = 30;
        Date now = new Date();

         System.out.println(now + "\n");

        byte x = 1;
        byte y = x;

        x = 2;

        System.out.println("\n" + y);

        */

        
		int x=1;
        int y=2;
        Point point1 = new Point(x , y );
        Point point2 = point1;

        point1.x = 2;
        
        System.out.println(point2.x);
        

    }
    
}
