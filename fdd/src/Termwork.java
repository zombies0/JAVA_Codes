import java.util.*;


public class Termwork {

    public static void main(String [] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the length of string\n\n");
        n = sc.nextInt();

        String [] d = new String[n];

        System.out.println("\nEnter the values of String\n\n");

        for (int i = 0; i < d.length; i++) {
            d[i] = sc.nextLine();
        }

        sc.close();

        
        int c = 0;
        /*
        for (int i = 0; i < n-1; i++) {

           //assc = Integer.parseInt(d[i]);
           assc = d[i].charAt(i);

            if (assc < 65 && assc > 117) {
                sum = sum + assc;
            }
            
        }
        */

       for (String var : d) {

        for (int i = 0; i < var.length(); i++) {

            if (var.charAt(i) == '4') {
                c++;
            }

        }
            
        }

        System.out.println(c);
    }
    
}
