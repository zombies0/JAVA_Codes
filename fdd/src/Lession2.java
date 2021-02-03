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

        
		int x;
        int y;
        Point point1 = new Point(x = 1, y = 2);
        Point point2 = point1;

        point1.x = 2;
        
        System.out.println(point2.x);
        

    }
    
}
