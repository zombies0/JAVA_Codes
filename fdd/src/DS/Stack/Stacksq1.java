//Ques1 reverse a string using stacks
package DS.Stack;

public class Stacksq1 {

    public static void main(String[] args) {
        
        String s = "abcd";

        System.out.println(reverseS(s));

        
    }

    public static String reverseS(String s) {

        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        for(char i : s.toCharArray()){
            stack.push(i);
        }

        StringBuffer b = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            b.append( stack.pop() );

        }

        return b.toString();

    }
    
}
