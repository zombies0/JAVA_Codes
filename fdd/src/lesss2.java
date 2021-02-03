public class lesss2 {
    
    public static void main(String[] args){

        int [] a = {1,2,3,4,5,6};
        int [] sum = new int[a.length];
        int i = 0;
        boolean l = false;
        if (a.length % 2 == 0) {
            l = true;
        }

        for (i = 0; i < a.length-1; i++) {
            

            sum[i] = a[i] + a[i+1];                 
         
        }

        if (l) {

            sum[i] = a[i];

            for (int j = 0; j < sum.length; j++) {

                System.out.println(sum[j]);
    
            }
            
        }else{

            for (int j = 0; j < sum.length-1; j++) {

                System.out.println(sum[j]);
    
            }
        }

    }
}
