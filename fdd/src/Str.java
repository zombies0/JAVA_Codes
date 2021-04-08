public class Str {

    public static void main(String [] args) {

       // char[] c = {'a','b','c','a','v','a','n','a'};

        //String s = "geunew String(c)";

        String sum = "abc";
        String m = "abc";

        System.out.println(sum.equals(m));
        System.out.println(sum == m);

        String sum1 = new String("abc");
        String sum2 = new String("abc");

        System.out.println(sum1.equals(m));
        System.out.println(m == sum2);

        System.out.println(m.concat("av"));

        System.out.println("add".length());

        System.out.println(sum2.contains("s"));

        System.out.println(sum2.indexOf("c"));

        System.out.println(sum2.lastIndexOf("c"));

        System.out.println(sum2.indexOf("c",2));

        System.out.println(sum2.substring(0));//'abc' = abc

        System.out.println(sum2.substring(0,2));//'abc' = ab

       // String f ="";
        String fg[] ={"2","g"};
        System.out.println(fg.length);

       Bb.main(fg);
        
    }
    
}
class Bb{

    public static void main(String []args){

        for (String fg : args) {
            System.out.println("\n\navcscsc" + fg);
        }

    }



}
