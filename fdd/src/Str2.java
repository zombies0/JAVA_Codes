//wap to print sum of all postive command line arrguments upto a single digit;
class Str2 { 

    public static void main(String s1[]) { 

        int[] sa = new int[s1.length];

        for (int i = 0; i < s1.length; i++) {

            sa[i] = Integer.parseInt(s1[i]);
            
        }
        int sum = 0;

        for (int i = 0; i < s1.length; i++) {
            
            if (sa[i] > 0) {
                
                sum += sa[i];

            }
        }

        if(sum > 10){

        String v = String.valueOf(sum);

        char h = v.charAt(0);
        char j = v.charAt(1);

        int o = h - '0';
        int p = j - '0';

        System.out.println("\n\nSum  =  " + ( o + p));
        }
        else{
            System.out.println("\n\nSum  =  " + sum);
        }

    } 
    
}