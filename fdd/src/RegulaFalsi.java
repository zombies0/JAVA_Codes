//Regula Falsi

import java.lang.*;
import java.util.*;

class RegulaFalsi {

    public static void main(String[] args) {

        Double x1 = 0.0,x2 = 0.0,tol = 0.0;
        InnerRegulaFalsi fal = new InnerRegulaFalsi();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for x1\n");
        x1 = sc.nextDouble();
        System.out.println("Enter the value for x2\n");
        x2 = sc.nextDouble();
        System.out.println("Enter the value for tolerance\n");
        tol = sc.nextDouble();

        System.out.println("X = " + fal.root(x1,x2,tol));
        
    }
    
}

class InnerRegulaFalsi {

    Double f(Double x){

        Double r = Math.pow(x,2) + (2.0 * x) - 15.0;
        
        return r;
    }

    Double tolDif(Double mx1, Double mx2){

        mx1 = Math.abs(mx1);
        mx2 = Math.abs(mx2);

        return Math.abs(mx1-mx2);
    }

    Double root(Double x1, Double x2, Double tol){

        Double mm2 = 0.0, mm = 0.0, m = 0.0;
        Double tolDiff = 10.0;
        int i = 0;
        Double f1 = f(x1), f2 = f(x2);

        if (f1 == 0.0 ){
            System.out.println("Value found\n");
            return x1;

        }if(f2 == 0.0){

            System.out.println("\nValue found\n");
            return x2;
            
        }

        if (f1 * f2 < 0){

            while (tolDiff > tol) {

                mm2 = mm;
                
                m = ( ( (f(x2) * x1) - (f(x1) * x2) )/ (f(x2) - f(x1)) );
        
                mm = f(m);

                tolDiff = tolDif(mm,mm2);

                if (mm == 0.0) {

                    System.out.println("Value Found = \n");
                    return m;
                    
                } else if((f(x1) * mm) < 0)

                    x2 = m;
                    
                else

                    x1 = m;      

                i++;

                System.out.println("m = " + m);

            }

        }else{

            System.out.println("Enter right value b/w positive and negative\n");
            return 0.0;
        }

        System.out.println("Tolerance limit reached\n" + i);
        return m;
    }

}
