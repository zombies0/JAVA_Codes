import java.util.*;

public class class2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        funct fc = new funct();

        int n = 0,x = 0,op = 0;
        int s = 0;
        
        double e = 0,abs_err = 0,tr_v = 0,re_err = 0,perc_err = 0;

        while (s != -5) {
            
        

            System.out.print("\n\nEnter the Option\n");
            System.out.print("\n1 to find exponential expression\n2 to calculate absolute error\n3 to calculate realtive error\n4 calculate percentage error\n5 for exit\n\n");
        
            op = sc.nextInt();

            switch (op) {

                case 1:

                    System.out.print("Enter the value of n\n");
                    n = sc.nextInt();

                    System.out.print("Enter the value of x\n");
                    x = sc.nextInt();

                    e = fc.find_nth_term(n, x);

                    System.out.print("Ans = " + e);

                    abs_err = e;
                
                    break;

                case 2:

                    System.out.print("Enter the true value\n");
                    tr_v = sc.nextDouble();

                    abs_err = fc.absl_err(abs_err,tr_v);

                    System.out.print("Absolute error = " + abs_err);
                
                    break;

                case 3:

                    re_err = fc.real_err(abs_err, tr_v);
                    System.out.print("realtive error = \n" + re_err);

                    break;

                case 4: 

                    perc_err = fc.pcnt_err(re_err);

                    System.out.print("percentage error = " + perc_err + " %");

                    break;

                case 5:

                    System.out.println("\n\nEXIT\n\n");
        
                    return ;

                default:

                    System.out.print("Enter right value\n");
                    break;
        }

        }

        sc.close();

    }

    
}
class funct{

    double find_nth_term(int n,int x){

        double e = 0;

        if(n == 1){
            
            return (double)(1) + (double)x;

        }
        else{

            while (n != 0) {

                e = e + (double)(power(x,n)) /  (double)(intfact(n));
                
                if (n == 2) {
                    
                    return e + 3;

                }

                n--;

            }
        }

        return e + 3d;
        
    }

    int power(int b,int exp){

        int result = 1;

        while (exp != 0){
            result *= b;
        
            exp--;
        }

        return result;

    }

    int intfact(int n) {
        if (n>=1)
            return n*intfact(n-1);
        else
            return 1;
    }

    double absl_err(double app_v,double tr_v){

        return Math.abs(tr_v - app_v);
    }
    
    double real_err(double abs_err,double tr_v){
    
        return abs_err / tr_v;
    
    }
    double pcnt_err(double re_err){
    
        return re_err * 100;
    
    }
    
}