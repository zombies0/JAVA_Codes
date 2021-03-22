//Ques 9

class A{

    public static void main(String[] args) {

        Object[] o = {"df",32,"dfjksn",2};
        int sum = 0;
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < o.length; i++) 
            
            if (o[i] instanceof Integer) 

                sum += (Integer)o[i];
                
            else if( o[i] instanceof String)

                str.append((String)o[i]);

        System.out.println("Sum = " + sum + "\nReverse String = " + str.reverse());

    }
}