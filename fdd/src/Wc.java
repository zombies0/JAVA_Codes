//Wrapper Class

public class Wc {

    public static void main(String[] args) {
        int a = 1;

        //Integer I = new Integer(a);//
    
        //System.out.println(I);

        //Integer k = Integer.valueOf(a);//

        String s1 = Integer.toString(a);//convert to string
        String s2 = String.valueOf(a);

        System.out.println(s1 + s2);

        System.out.println((Integer.parseInt(s1) + Integer.parseInt(s2)));//converting string to integer

        float ab = 2.45454f;

        String s3 = Float.toString(ab);

        System.out.println((Float.parseFloat(s3) + (float)a));//float cannot convert to int using wrapper class


    }
    
}

