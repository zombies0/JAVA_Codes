public class Lession1 {

    public static void main (String [] args){

        int [] a = {1,2,0,-1,-2,3,5,8,9,11,4};
        
        System.out.println("\n");

        odd_ev(a);

    }

    static void odd_ev (int a[]){

        int[] odd = new int[a.length];
        int[] even = new int[a.length];
        int j = 0; int k = 0;

        for (int i = 0; i < a.length; i++) {
            
            if (a[i] % 2 == 0 && a[i] > 0) {
                //Even
                even[i] = a[i];

                j++;
                
            }else if(a[i] % 2 != 0 && a[i] > 0) {
                //Odd
                odd[i] = a[i]; 
                k++;           
            }
        }

        int[] odd1 = new int[k];
        int[] even2 = new int[j];

        int c = 0;
        int d = 0;

        for (int i = 0; i < even.length; i++) {

            if (odd[i] > 0) {

                odd1[c]  = odd[i];
                c++;
                
            }
            else if(even[i] > 0){

                even2[d] = even[i];
                d++;

            }      
        }

        for (int i = 0; i < even2.length; i++) {
            System.out.println("even = " + even2[i]);
        }

        System.out.println();

        for (int i = 0; i < odd1.length; i++) {
            System.out.println("odd = " + odd1[i]);

        }
        System.out.println("\nCheck Prime\n");

        for (int i = 0; i < even2.length; i++) {
            System.out.println(even2[i] + " = " + is_prime(even2[i]));
        }

        System.out.println();

        for (int i = 0; i < odd1.length; i++) {

            System.out.println(odd1[i] + " = " + is_prime(odd1[i]));
            
        }

    }

    static boolean is_prime(int p){

        int flag = 0;

        for (int i = 2; i <= p/2; i++) {

            if (p % i == 0) {

                flag = 1;
                break;
                
            }
              
        }

        System.out.println("Flag = " + flag);

        if (p == 1) {
            
            return false;
        }
        else if(flag == 0){
        
            return true;
        }
        else{
            return false;
        }

    }
}