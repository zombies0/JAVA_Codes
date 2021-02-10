import java.util.*;

public class Bd {

    public static void main(String[] args) {
        
        String [] str = new String[6];
        String [] str2 = new String[116];
        str[0] = "ali";
        str[1] = "ram";
        str[2] = "shyam";
        //str[3] = "uk";
        //str[4] = "mp";
        //str[5] = "xp";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string city name \n\n");

       /* for (int i = 0; i < 5; i++) {
            
            System.out.println("Enter city No.  =  " + (i + 1));

            str[i] = sc.nextLine();
       */ //}

        int[] a = new int[46];

        for (int i = 0; i < 3; i++) {

            for (int j = 1; j < 2; j++) {

                a[i] = str[i].compareTo(str[j]);

                //System.out.println("a =  " + a[i] + "   i =  " + (i+1));
  
                str2[i] = str[i];
  
            } 
            
        }
       

        System.out.println(str2[a[1]]);
        System.out.println(str2[a[2]]);
        System.out.println(str2[2]);
       
        
    }
    
}
