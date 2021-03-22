//ques 10

class Q10s {

    public static void main(String[] args) {
        
        String s = "44aP12xD-123bQ2-14",sum = "";
        StringBuffer str = new StringBuffer();
        int sum1 = 0,sum2 = 0,k = 1;

        for (int i = 0; i < s.length(); i++) 
           
            if (Character.isLetter(s.charAt(i))) 

                if (Character.isLowerCase(s.charAt(i))) 
                    
                    str.append((char) Character.toUpperCase(s.charAt(i)+1) + " ");
                
                else   

                    str.append((char) Character.toLowerCase(s.charAt(i)-1) + " ");

        for (int i = 1; i < s.length(); i++){
            
            if (Character.isDigit(s.charAt(i)) && s.charAt(i-1) == '-'){
                
                int j = i;

                while(Character.isDigit(s.charAt(j)) && j < s.length()){
                
                    sum += Character.getNumericValue(s.charAt(j++));

                    if (j == s.length()) break;

                }
                sum1 += Integer.parseInt(sum);
                sum = "";   

            }
            
            if (k == i) k = i-1;
            else if (k < i ) k = i;
            
            if (k < s.length() && Character.isDigit(s.charAt(k))  ) {
                    
                while(Character.isDigit(s.charAt(k))){
        
                    sum += Character.getNumericValue(s.charAt(k++));
        
                    if (k == s.length()) break;
                        
                }
                sum2 += Integer.parseInt(sum);
                sum = "";
                k++;
                
            }
        }

        System.out.println("\n\nString = " + str + "\nNegative Sum = -" + sum1 + "\nPositive Sum = " + (sum2-sum1) + "\n");

    }
}