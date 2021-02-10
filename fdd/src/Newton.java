import java.util.*;

public class Newton {

    public static void main(String s[]) {

        double x1,x2,tol,y;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the value of x1\n");
        x1 = sc.nextDouble();
        System.out.println("\nEnter the value of x2\n");
        x2 = sc.nextDouble();
        System.out.println("\nEnter the value of tol\n");
        tol = sc.nextDouble();

        y = new_root(x1, x2, tol);

        System.out.println("\nroot = \n" + y);

    }

    static double f(double x){

        return x*Math.log10(x)-1.2;
    }
    
    static double fd(double x){
    
        return Math.log10(x) + 0.43429;
    }
    
    static double new_root(double x1,double x2,double tol){
    
        if ( f(x1) == 0.0 )
    
            return x1;       
        
        else if(f(x2) == 0.0)
    
            return x2;
       
        if ( (f(x1) * f(x2) ) < 0){
    
            double xp = ( x1 + x2 ) / 2.0;
            double xc = xp;

            do{
                xp = xc;

                xc = xp - (f(xp))/(fd(xp));

                if (f(xc) == 0.0)
                    
                    return xc;
                
            }while (Math.abs(xc-xp) > tol);

            return xc;
            
        }else
        
            System.out.println("\n\nError: Enter the rigth value b/w positve and negative\n\n");
            
        return 0;
    }
    
}
