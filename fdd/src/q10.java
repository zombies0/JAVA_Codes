class q10 {
 
    public static void main(String[] args) {
        
        String s = "44aP12xD-123bQ2-14";//137//195
        StringBuffer str = new StringBuffer();
        String sum = "";
        int sum1 = 0;
        int sum2 = 0;
        StringBuffer negSum = new StringBuffer();

        for (int i = 0; i < s.length(); i++) 
           
            if (Character.isLetter(s.charAt(i))) 

                if (Character.isLowerCase(s.charAt(i))) 
                    
                    str.append((char) Character.toUpperCase(s.charAt(i)+1));
                
                else   

                    str.append((char) Character.toLowerCase(s.charAt(i)-1));

        

        for (int i = 1; i < s.length(); i++){
            
            if (Character.isDigit(s.charAt(i)) && s.charAt(i-1) == '-'){
                
                int j = i;

                while(Character.isDigit(s.charAt(j)) && j < s.length()){
                
                    sum += Character.getNumericValue(s.charAt(j));

                    j++;
                    
                    if (j == s.length()) {
                        break;
                    }
                    
                }
                sum1 += Integer.parseInt(sum);
                sum = "";
                i = j;

                

            }
        }

        for (int j2 = 0; j2 < s.length(); j2++) {

         if (Character.isDigit(s.charAt(j2))) {
            int k = j2;
            while(Character.isDigit(s.charAt(k))){

                sum += Character.getNumericValue(s.charAt(k));

                k++;

                if (k == s.length()) {
                    break;
                }

            }
            sum2 += Integer.parseInt(sum);
            sum = "";

            j2 = k;

         }           
                    
        }

        System.out.println("sum 1 = " + sum1);
        
        

    }
    

}
